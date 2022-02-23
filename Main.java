import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  String[] words = {"abuse", "adult", "agent", "anger", "apple", "award", "basis", "beach", "birth", "block", "blood", "board", "brain", "bread", "break", "brown", "buyer", "cause", "chain", "chair", "chest", "chief", "child", "china", "claim", "class", "clock", "coach", "coast", "court", "cover", "cream", "crime", "cross", "crowd", "crown", "cycle", "dance", "death", "depth", "doubt", "draft", "drama", "dream", "dress", "drink", "drive", "earth", "enemy", "entry", "error", "event", "faith", "fault", "field", "fight", "final", "floor", "focus", "force", "frame", "frank", "front", "fruit", "glass", "grant", "grass", "green", "group", "guide", "heart", "henry", "horse", "hotel", "house", "image", "index", "input", "issue", "japan", "jones", "judge", "knife", "laura", "layer", "level", "lewis", "light", "limit", "lunch", "major", "march", "match", "metal", "model", "money", "month", "motor", "mouth", "music", "night", "noise", "north", "novel", "nurse", "offer", "order", "other", "owner", "panel", "paper", "party", "peace", "peter", "phase", "phone", "piece", "pilot", "pitch", "place", "plane", "plant", "plate", "point", "pound", "power", "press", "price", "pride", "prize", "proof", "queen", "radio", "range", "ratio", "reply", "right", "river", "round", "route", "rugby", "scale", "scene", "scope", "score", "sense", "shape", "share", "sheep", "sheet", "shift", "shirt", "shock", "sight", "simon", "skill", "sleep", "smile", "smith", "smoke", "sound", "south", "space", "speed", "spite", "sport", "squad", "staff", "stage", "start", "state", "steam", "steel", "stock", "stone", "store", "study", "stuff", "style", "sugar", "table", "taste", "terry", "theme", "thing", "title", "total", "touch", "tower", "track", "trade", "train", "trend", "trial", "trust", "truth", "uncle", "union", "unity", "value", "video", "visit", "voice", "waste", "watch", "water", "while", "white", "whole", "woman", "world", "youth", "alcon", "aught", "hella", "ought", "thame", "there", "thine", "where", "which", "whose", "whoso", "yours", "admit", "adopt", "agree", "allow", "alter", "apply", "argue", "arise", "avoid", "begin", "blame", "break", "bring", "build", "burst", "carry", "catch", "cause", "check", "claim", "clean", "clear", "climb", "close", "count", "cover", "cross", "dance", "doubt", "drink", "drive", "enjoy", "enter", "exist", "fight", "focus", "force", "guess", "imply", "issue", "judge", "laugh", "learn", "leave", "limit", "marry", "match", "occur", "offer", "order", "phone", "place", "point", "press", "prove", "raise", "reach", "refer", "relax", "serve", "shall", "share", "shift", "shoot", "sleep", "solve", "sound", "speak", "spend", "split", "stand", "start", "state", "stick", "study", "teach", "thank", "think", "throw", "touch", "train", "treat", "trust", "visit", "voice", "waste", "watch", "worry", "would", "write", "above", "acute", "alive", "alone", "angry", "aware", "awful", "basic", "black", "blind", "brave", "brief", "broad", "brown", "cheap", "chief", "civil", "clean", "clear", "close", "crazy", "daily", "dirty", "early", "empty", "equal", "exact", "extra", "faint", "false", "fifth", "final", "first", "fresh", "front", "funny", "giant", "grand", "great", "green", "gross", "happy", "harsh", "heavy", "human", "ideal", "inner", "joint", "large", "legal", "level", "light", "local", "loose", "lucky", "magic", "major", "minor", "moral", "naked", "nasty", "naval", "other", "outer", "plain", "prime", "prior", "proud", "quick", "quiet", "rapid", "ready", "right", "roman", "rough", "round", "royal", "rural", "sharp", "sheer", "short", "silly", "sixth", "small", "smart", "solid", "sorry", "spare", "steep", "still", "super", "sweet", "thick", "third", "tight", "total", "tough", "upper", "upset", "urban", "usual", "vague", "valid", "vital", "white", "whole", "wrong", "young", "afore", "after", "bothe", "other", "since", "slash", "until", "where", "while", "aback", "abaft", "aboon", "about", "above", "accel", "adown", "afoot", "afore", "afoul", "after", "again", "agape", "agogo", "agone", "ahead", "ahull", "alife", "alike", "aline", "aloft", "alone", "along", "aloof", "aloud", "amiss", "amply", "amuck", "apace", "apart", "aptly", "arear", "aside", "askew", "awful", "badly", "bally", "below", "canny", "cheap", "clean", "clear", "coyly", "daily", "dimly", "dirty", "ditto", "drily", "dryly", "dully", "early", "extra", "false", "fatly", "feyly", "first", "fitly", "forte", "forth", "fresh", "fully", "funny", "gaily", "gayly", "godly", "great", "haply", "heavy", "hella", "hence", "hotly", "icily", "infra", "jildi", "jolly", "laxly", "lento", "light", "lowly", "madly", "maybe", "never", "newly", "nobly", "oddly", "often", "other", "ought", "party", "piano", "plain", "plonk", "plumb", "prior", "queer", "quick", "quite", "ramen", "rapid", "redly", "right", "rough", "round", "sadly", "secus", "selly", "sharp", "sheer", "shily", "short", "shyly", "silly", "since", "sleek", "slyly", "small", "sound", "spang", "srsly", "stark", "still", "stone", "stour", "super", "tally", "tanto", "there", "thick", "tight", "today", "tomoz", "truly", "twice", "under", "utter", "verry", "wanly", "wetly", "where", "wrong", "wryly"};
   String word = words[(int)(Math.random()*words.length)];
   Scanner input = new Scanner(System.in);
  int g = 6;
   String guess = "";
   Instructions m = new Instructions();
   m.instructions();
   while (!guess.equals(word)&&g>0) {
     System.out.println(" You got " +g+ " guesses remaining");
   guess = input.nextLine();
     if(guess.length()!=5) {
       Failure f = new Failure();
       f.fail();
   continue;
        }
     for (int i = 0; i<word.length(); i++) {
       boolean didBreak = false;
       for (int j = 0; j<word.length();j++) {
         if (guess.charAt(i)==word.charAt(i)){
           System.out.print("!");
           didBreak = true;
         break;
          }
         if (guess.charAt(i)==word.charAt(j)) {
           System.out.print("~");
           didBreak= true;
           break;
         }
       }
       if (!didBreak){
         System.out.print("X");
       }
     }
     g--;
   }
   if (guess.equals(word)) {
      System.out.println(" Good job! You guessed it!");
     if (g>=4){
       System.out.println("Here is a Trophy!");
      Trophy t = new Trophy();
       t.printTrophy();
       }
       }
   
   else System.out.println(" EHHH! Wrong! L Bozo! The word was: " +word );
   }
}
