import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    // problem solve 1
    public static void Assignment17(){
        System.out.println("Enter your favorite number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if(j%2==0){
                    System.out.print(" 0");
                }else {
                    System.out.print(" 1");
                }
            }
            System.out.println();
        }
    }

    public static void Array2(){
        Scanner scanner = new Scanner(System.in);
        double[] number = new double[5];

        for(int i=0; i< number.length; i++){
            System.out.print("Enter your favorite array index number " + i + ": ");

            number[i] = scanner.nextInt();
        }

        double sum = 0;
        for(int i=0; i< number.length; i++){
            sum += number[i];
        }

        System.out.println("Total sum: "+sum);

    }

    // problem solve 2
    public static void Array1(){
        int [][] number = new int[4][5];
        int k=0;


        //assigning the value to the 2d array
        for(int i=0; i < 4; i++){
            for (int j = 0; j < 5; j++){
                number[i][j] = k;
                k++;
            }
        }

        for(int i=0; i<number.length; i++){
            for(int j=0; j< i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    // problem solve 3

    public static void Array3(){
        String[] names = {"Anis", "Parvez", "Shanta", "Anam"};
        System.out.println(names.length);

        for(String p: names){
            System.out.println(p);
        }

    }

    // problem solve 4

    public static void Array4(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter your favorite index of day: ");
            int p = sc.nextInt();

            switch (p){

                case 1:
                    System.out.println("Monday");
                    System.out.println("Have a good day");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    System.out.println("Have a good day");

                    break;
                case 3:
                    System.out.println("Wednesday");
                    System.out.println("Have a good day");

                    break;
                case 4:
                    System.out.println("Thursday");
                    System.out.println("Have a good day");

                    break;
                case 5:
                    System.out.println("Friday");
                    System.out.println("Have a good day");

                    break;
                case 6:
                    System.out.println("Saturday");
                    System.out.println("Have a good day");

                    break;
                case 7:
                    System.out.println("Sunday");
                    System.out.println("Have a good day");

                    break;

                default:
                    System.out.println("Please enter a valid index of days :)");
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }


    //problem solve 5

    public static void solve1(int[] arr, int n){
        int max = arr[0];

        //find array max number

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        if(max >= n){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }




    //problem solve 6

    public static void problem2(String str1, String str2){
        boolean check = str1.endsWith(str2);
        System.out.println(check);
    }

    // problem solve 7
    public static void problem3(String word){
        String str = word.substring(0,2);
        System.out.println(str);
    }


    //problem solve 8
    public static void problem4(int num1, char operator, int num2){
        switch (operator){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
        }
    }

    //problem solve 9

    public static void  problem5(int[] arr){
        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i <arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int i = 0; i <arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        int count = 0;
        for (int i = min; i < max; i++){
            count++;
        }

        System.out.println(count);
    }

    //problem solve 10
    public static void problem6(final String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());
    }

    //problem solve 11

    public static  void problem11(int num){
        if(num%3==0 && num%5==0){
            System.out.println("FizzBuzz");
        } else if (num%3 == 0) {
            System.out.println("Fizz");
        } else if (num%5 == 0) {
            System.out.println("Buzz");
        }else {

            System.out.println(""+num);
        }
    }


    // problem solve 12
    public static void problem12(int price, int percentage){
        double res = price - (price*((double)percentage/100));
        System.out.println(res);
    }

    //problem solve 13

    public static void problem13(String s){
        String[] str = s.split(" ");
        String str1 = str[1] + " " + str[0];
        System.out.println(str1);
        for(String p: str){
            System.out.println(p);
        }
    }

    //problem solve 14: word count
    public static void problem14(String str){
        String[] str1 = str.split(" ");
        System.out.println(str1.length);
    }

    //problem solve 15: equality of 3 values
    public static void problem15(int a, int b, int c){

        int count = 0;
        if(a == b && a==c){
            count+=3;
        } else if (a==c) {
            count+=2;
        } else if (b==c) {
            count+=2;
        }else {
            count+=0;
        }
        System.out.println(count);
    }


    //problem solve 16: Phone number formatting
    public static void problem16(int[] nums){
        String str = "" + nums[3] + nums[4] + nums[5];
        String str1 = "" + nums[6] + nums[7] + nums[8] + nums[9];
        System.out.println("(" + nums[0]+nums[1]+nums[2] + ")" + " " + str + "-" + str1);
    }


    // Problem solve 17: How many vowels
    public static void problem17(String str){
        String low = str.toLowerCase();
        int count= 0;

        for(int i = 0; i < low.length(); i++){
            if (low.charAt(i) == 'a' || low.charAt(i)== 'e' || low.charAt(i)== 'i' || low.charAt(i)== 'o' || low.charAt(i)== 'u'){
                count++;
            }
        }

        System.out.println(count);
    }


    // Problem solve 18: Stuttering we speak

    public static void problem18(String word){
        String[] st = word.split("");
        String st1 = st[0];
        String st2 = st[1];
        String st3 = st1+st2;
        System.out.println(st3 + "... " + st3 + "... " + word);
        char s1 = word.charAt(0);
        char s2 = word.charAt(1);
        System.out.println(s1+s2);
    }

// Problem solve 19: the three programmers problems
    public static void problem19(int one, int two, int three){
        int max1 = Math.max(one, two);
        int max2 = Math.max(max1, three);

        int min1 = Math.min(one, two);
        int min2 = Math.min(min1, three);

        System.out.println(max2 - min2);
    }

    //Problem solve 20: trianguler number sequence
    public static void problem20(int n){
        int p = n*(n+1)/2;
        System.out.println(p);
    }

    // Problem solve 21: Xs and Os nobody know
    public static void problem21(String str){
        str = str.toLowerCase();
        int oCount = 0;
        int xCount = 0;

        //count o and x
        for(char c : str.toCharArray()){
            if(c == 'o'){
                oCount++;
            } else if (c == 'x') {
                xCount++;
            }
        }

        System.out.println(oCount);
        System.out.println(xCount);
        System.out.println(oCount == xCount);


    }

    //Problem solve 22: Repeating letter
    public static void problem22(String s){

        String[] st = s.split("");
        for(String c1: st){
            System.out.print(c1+c1);
        }

    }

    //Problem solve 23: Find The secondLargest Number
    public static void problem23(int[] num){

        Arrays.sort(num);
        System.out.println(num[num.length-2]);
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }

    }

    //sort ascending and descending of number
    public static void ascenDescn(int[] num){

        //Ascending
        System.out.print("Ascending: " );
        Arrays.sort(num);
        for(int i = 0; i<num.length; i++){
            System.out.print( num[i] + " ");
        }

        System.out.println();
        //Descending
        System.out.print("Descending: " );
        for(int i = num.length -1; i>=0; i--){
            System.out.print(num[i] + " ");
        }
        System.out.println();

        //Ascending string sorted
        String[] names = {"Parvez", "Khadiza", "Farjana", "Suheb", "Emon"};
        Arrays.sort(names);

        System.out.print("Ascending String: " );
        for(String name: names){
            System.out.print(name + ", ");
        }

        System.out.println();

        System.out.print("Descending String: ");
        for(int i = names.length-1; i>=0; i--){
            System.out.print(names[i] + ", ");
        }
    }

    // Arraylist
    public static void Arraylist1(){
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("size of array = " + al.size());

        //add element
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(0, 40);


        Iterator itr = al.iterator();
        System.out.print("Array of arrayList: ");
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        System.out.println();
        System.out.print("Array of arrayList: ");
        // Print foreach loop
        for(int p: al){
            System.out.print(p + " ");
        }

        System.out.println();
        System.out.println("Array of arrayList: "+al);
        System.out.println("size of array = " + al.size());

        //Remove elements
        al.remove(2);
        System.out.println("After removing index of element 2: "+al);

        //Remove all elements
        al.removeAll(al);
        System.out.println("Remove all element of array: " + al);

        boolean b = al.isEmpty();
        System.out.println("The array is empty: " + b);

        //check the value here or not
        boolean ct = al.contains(30);
        System.out.println("30 is in the list : "+ ct);

        //find value in index
        int pos = al.indexOf(40);
        System.out.println("The index of 40 is : " + pos);

        //set a value in array
        al.set(0, 50);
        System.out.println("After setting: " + al);

        //get a value from array
        int x = al.get(0);
        System.out.println("Get a value of index 0: "+ x);

        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();

        num1.add(10);
        num1.add(20);
        num1.add(30);
        num1.add(40);
        System.out.println("Number 1 = " + num1);

        //add all element of num1
        num2.addAll(num1);
        System.out.println("Add all element in num2 from num1: "+ num2);

        //check if same two array
        boolean bal = num1.equals(num2);
        System.out.println("num1 == num2: "+ bal);

        //sorting arrayList
        ArrayList<Integer> num3 = new ArrayList<>();
        num3.add(20);
        num3.add(-3);
        num3.add(30);
        num3.add(25);
        num3.add(22);
        num3.add(34);

        System.out.println("before sorting: " + num3);

        //sort array list
        Collections.sort(num3);
        System.out.println("After sorting in ascending: "+ num3);

        //reverse array list
        Collections.sort(num3, Collections.reverseOrder());
        System.out.println("After sorting in descending: "+ num3);

    }

    //String
    public static void string1(){
        String s1 = "My name is Parvez Ahmed";
        String s2 = new String("My name is Parvez Ahmed");
        char[] s3 = {'a', 's', 't','a', 'd','i', 'n'};

        System.out.println(s3);
        System.out.println(s2);
        System.out.println(s1);

        int len = s1.length();
        System.out.println("Length of s1: "+ len);

        //check value is equal or not
        //if you need case insencetive you can use equalsIgnoreCase
        if(s1.equals(s2)){
            System.out.println("Equals");
        }else {
            System.out.println("Not equals");
        }

        //check have a value or not
        if(s1.contains("Parvez")){
            System.out.println("Have");
        }else {
            System.out.println("Havn't");
        }

        //concat string
        String firstName = "Parvez";
        String lastName = " Ahmed";

        String fullName = firstName + lastName;
        //use concat method
        String fullName1 = firstName.concat(lastName);

        System.out.println(fullName1);
        System.out.println(fullName);

        //toUpperCase
        String upperName = fullName.toUpperCase();
        System.out.println(upperName);

        //toLowerCase
        String lowerCase = fullName.toLowerCase();
        System.out.println(lowerCase);

        //check startsWith
        boolean b = firstName.startsWith("P");
        System.out.println(b);

        //check endsWith
        boolean b1 = lastName.endsWith("d");
        System.out.println(b1);


        String [] names = {"Khadiza", "Farjana", "Emon", "Shanju"};

        for(String name: names){
            System.out.println(name);
        }

        String country = "Bangladesh is my country";
        System.out.println(country);

        //use charAt method
        char ch = country.charAt(0);
        System.out.println("ch "+ ch);

        //return ascii value
        int value = country.codePointAt(0);
        System.out.println("value = "+value);

        //return index position
        int pos = country.indexOf('n');
        System.out.println("First position of n = "+ pos);

        pos = country.lastIndexOf('n');
        System.out.println("last position of n = "+ pos);

        String country1 = "   Bangladesh is my country  ";
        //remove all blank space
        System.out.println(country1.trim());

        String sp = "This is my country";
        System.out.println(sp);

        String sp1 = sp.replace('i', 'j');
        System.out.println(sp1);

        String[] sp2 = sp.split(" ");
        for(String p: sp2){
            System.out.println(p);
        }
    }

    // String buffer
    public static void stringBuffer(){
        String s1 = "Parvez";
        StringBuffer sb = new StringBuffer(s1);

        sb.append(" Ahmed");
        sb.append(25);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(0, 7);
        System.out.println(sb);

        //you can set length your own
        sb.setLength(7);
        System.out.println(sb);
    }

    // String palindrome or not
    public static void stringPalindrome(){
        String s1 = "madam";
        StringBuffer sb = new StringBuffer(s1);

        String s2 = sb.reverse().toString();

        if(s1.equals(s2)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }

    // String builder method

    public static void stringBuilder(){
        StringBuilder sb = new StringBuilder("Parvez");

        sb.append(" Ahmed");
        sb.append(25);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }

    //WrapperClass
    public static void wrapperDemo(){
        //primitive -> object
        int x = 30;
        Integer y = x;
        System.out.println(y);

        //object -> primitive data type
        Double d = 10.25;
        System.out.println(d);

        double e = d.doubleValue();
        System.out.println("e = "+ e);
    }

    // Conversion String to Primitive data type

    public static void conversionDemo(){

        //integer to string
        int i = 100;
        String s = Integer.toString(i);
        System.out.println("s = " + s);

        //double to string
        double i1 = 100.25;
        String s1 = Double.toString(i1);
        System.out.println("s1 = " + s1);

        //boolean to string
        boolean b = true;
        String s2 = Boolean.toString(b);
        System.out.println("s2 = "+ s2);

        //String to integer
        String si = "32";
        int in = Integer.parseInt(si);
        System.out.println("i = " + in);

        //String to Double
        String sd = "34.5";
        double d = Double.parseDouble(sd);
        System.out.println("d = "+ d);
    }

    // binary, octal, hexadecimal Convert to decimal number
    public static void convertToDecimal(){
        // binary to decimal
        String binary = "1010";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println("The decimal number is: "+ decimal);

        //octal to decimal
        String octal = "675";
        Integer d = Integer.parseInt(octal, 8);
        System.out.println(d);

        //hexadecimal to decimal
        String hexa = "A7";
        Integer h = Integer.parseInt(hexa, 16);
        System.out.println("hexadecimal A7 of decimal number is: "+ h);

        //decimal to binary
        int dec = 15;
        String bi = Integer.toBinaryString(dec);
        System.out.println(bi);

        // decimal to octal
        String oc = Integer.toOctalString(dec);
        System.out.println(oc);

        //decimal to hexadecimal
        String  hexa1 = Integer.toHexString(dec);
        System.out.println(hexa1);
    }

    // Date and Time
    public static void dateNtime(){
        //Date access
        Date date = new Date();
        System.out.println(date);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = dateFormat.format(date);
        System.out.println("Current date is: "+currentDate);

        //Time access
        LocalTime time = LocalTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String st =  dateTimeFormatter.format(time);
        System.out.println("Now time is "+st + " o'clock.");
    }

    // Random method
    public static void randomMethod(){
        Random rand = new Random();
        int randomNumber = rand.nextInt(10);
        System.out.println("Random number = " + randomNumber);
    }

    // Add all value
    public static void sumAllValue(int ...num){
        int sum = 0;
        for(int p: num){
            sum+= p;
        }
        System.out.println("Total sum: " + sum);
    }

    // LinkList
    public static void linkList(){
        LinkedList<String> countryNames = new LinkedList<>();

        countryNames.add("Bangladesh");
        countryNames.add("Pakistan");
        countryNames.add("India");
        countryNames.add("Nepal");
        countryNames.add("Afghanistan");
        countryNames.addFirst("Australia");
        countryNames.addLast("USA");

        countryNames.removeFirst();
        countryNames.removeLast();

        System.out.println("First element : " + countryNames.getFirst());
        System.out.println("Last element : " + countryNames.getLast());
        for(String country: countryNames){
            System.out.println(country);
        }
        System.out.println("Size of the linkedList : "+countryNames.size());

        countryNames.clear();
        System.out.println("After clear of linkList the size is: " + countryNames.size());

    }


    // HashMap

    public static void hashMap(){
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(101, "Parvez");
        hm.put(102, "Shanta");
        hm.put(103, "Khadiza");

        System.out.println(hm.get(103));
    }

    // Find the large or equal number of the array
    public static void findTheOneLargeNumber(int[] arr, int num){
        Arrays.sort(arr);

        int res = arr[arr.length-1];
        if(res >= num){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    // repeating letter
    public static void repeatingLetter(String s){
        String [] st = s.split("");
        StringBuffer sb = new StringBuffer();
        for(String sm : st){
            sb.append(sm+sm);
        }

        String sp =  sb.toString();
        System.out.println(sp);
    }


    // scoring system
    public static void scoringSystem(String st){

        int a = 0;
        int b = 0;
        int c = 0;
        for(char s2: st.toCharArray()){
            if(s2== 'A'){
                a++;
            } else if (s2=='B') {
                b++;
            }else {
                c++;
            }
        }


        int[] str = {a,b,c};

        for(int x: str){
            System.out.println(x);
        }
    }

    //Capture the rook
    public static void captureTheRook(String[] st){

        String position1 = st[0];
        String position2 = st[1];

        // Extract row and column for both positions
        int row1 = position1.charAt(1) - '0';
        int col1 = position1.charAt(0) - 'A' + 1;
        int row2 = position2.charAt(1) - '0';
        int col2 = position2.charAt(0) - 'A' + 1;

        // Check if the Rook can capture
        System.out.println( row1 == row2 || col1 == col2);
    }


    // One array nested another

    public static void oneArrayNestedAnother(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        int min1 = arr1[0];
        int max1 = arr1[arr1.length -1];

        Arrays.sort(arr2);
        int min2 = arr2[0];
        int max2 = arr2[arr2.length -1];

        if(min1 > min2 && max1 < max2){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    //problem solve
    public static void reformTheWord(String st, String sp){
        String[] cp = st.split("");
        String s = cp[0].toUpperCase();

        System.out.println(s+st.substring(1)+ sp);

    }


    public static void getTheFileName(String path){
        String[] st = path.split("/");
        String sp = st[st.length-1];
        System.out.println(sp);
    }

    // remove every single vewol from the sentence
    public static void removeVwol(String st){
        String sp = "";
        for(char s: st.toCharArray()){

            if(s == 'a' || s== 'e'|| s== 'i'|| s== 'o'|| s== 'u'|| s== 'A'|| s== 'E'|| s== 'I'|| s== 'O'|| s== 'U'){
                continue;
            }else {
                sp += s;
            }
        }
        System.out.println(sp);
    }

    // find the bomb
    public static void findTheBomb(String bomb){
        String st = bomb.toLowerCase();
        if(st.contains("bomb")){
            System.out.println("DUCK");
        }else {
            System.out.println("Relax, there's no bomb.");
        }
    }


    //sort number
    public static void sortNumber(int[] nums){
       Arrays.sort(nums);

        for(int p: nums){

        }

    }

    public static void main(String[] args)  {

       int[] num = {1,2,40,50,3,5};
       sortNumber(num);
    }
}


//OOP

class Teacher{
    String name, gender;
    int phone;

    static final int fees;

    static {
        fees = 30;
    }

    Teacher(String name, String gender, int phone){
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }




    void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Gender : "+ gender);
        System.out.println("Phone : " + phone);
    }
}