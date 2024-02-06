public class AssessmentJava2 {
    public class Project {
        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 55;

            //Call a function
            isSixtyFive(num1, num2);
            System.out.println("The sum is " + isSixtyFive(num1,num2));

        }

        //Function for #1
        public static boolean isSixtyFive(int num1, int num2) {
            int sum = num1 + num2;
            if (sum == 65) {
                return true;
            } else if (sum != 65) {
                return false;
            }
            else {
                return false;
            }
        }
    }




















































}
