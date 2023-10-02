// package apr3;

// public class Main {
//     public static void main(String[] args) {
//         System.out.println(bracketsBalanced("(((())))"));
//     }

//     public static boolean bracketsBalanced(String brackets) {
//         LStack s = new LStack(); //LStack is available on moodle
//         String setOfBr = "<{[(";
//         for (int i = 0; i < brackets.length(); i++) {
//             char br = brackets.charAt(i);
//             if (setOfBr.contains(br+" ")) {
//                 s.push(br);
//                 continue;
//             }

//             if (s.isEmpty())
//                 return false;

//             char c;

//             switch (br) {
//                 case '}' -> {
//                     c = s.pop();
//                     if (c != '{')
//                         return false;
//                 }
//                 case ']' -> {
//                     c = s.pop();
//                     if (c != '[')
//                         return false;
//                 }
//                 case ')' -> {
//                     c = s.pop();
//                     if (c != '(')
//                         return false;
//                 }
//                 case '>' -> {
//                     c = s.pop();
//                     if (c != '<')
//                         return false;
//                 }
//             }
//         }

//         return s.isEmpty();
//     }
// }
