public class ComparingStrings {
    public static void main(String[] args) {
            String firstWord, secondWord, firstName, secondName, fullName;
            int age;

            firstName =  InputCollector.collectInput("please enter your firstName");
            secondName = InputCollector.collectInput("please enter your secondName");

            User user = new User(firstName, secondName);

            System.out.println("welcome" + " " + User.getFullName());

            firstWord = InputCollector.collectInput("please enter your first word");
            secondWord = InputCollector.collectInput("please enter your second word");
            age = Integer.parseInt(InputCollector.collectInput("please enter your age"));

//            boolean compareMethod = new EqualsMethod().equal(firstWord, secondWord);
            boolean compareMethod = StringUtils.equal(firstWord, secondWord);
//            new EqualsMethod().equalNoReturn(firstWord, secondWord);
            if (compareMethod) {
                    System.out.println("It is true");
            } else {
                    System.out.println("It is false");
            }
    }
}
