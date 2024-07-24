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

    public static boolean doubleLatter(String word){

        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    public static void sumAll(int ...p){
        int sum = 0;
        for(int pa: p){
            sum += pa;
        }

        System.out.println(sum);
    }

    public static void minMax(int [] arr){
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length -1];
        System.out.println(min + ", " + max);
    }

    public static void checkDivisibleByFive(int num){
        int num1 = Math.abs(num);
        if(num1 % 5 == 0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    public class Challenge {
        public static String replaceVowels(String str, char ch) {
            String str1 = "";

            for (int i = 0; i < str.length(); i++) {
                if (str.contains("i") || str.contains("a") || str.contains("e") || str.contains("o") || str.contains("u")) {
                }
            }
            return str;

        }
    }



    public static void allMinMaxValue(){
        //byte max and min value
        System.out.println("Byte max value: " + Byte.MAX_VALUE);
        System.out.println("Byte min value: " + Byte.MIN_VALUE);

        //short max and min value
        System.out.println("Short max value: " + Short.MAX_VALUE);
        System.out.println("Short min value: " + Short.MIN_VALUE);

        //integer max and min value
        System.out.println("Integer max value: " + Integer.MAX_VALUE);
        System.out.println("Integer min value: " + Integer.MIN_VALUE);

        //long max and min value
        System.out.println("Long max value: " + Long.MAX_VALUE);
        System.out.println("Long min value: " + Long.MIN_VALUE);

        //float max and min value
        System.out.println("Float max value: " + Float.MAX_VALUE);
        System.out.println("Float min value: " + Float.MIN_VALUE);


        //double max and min value
        System.out.println("Double max value: " + Double.MAX_VALUE);
        System.out.println("Double min value: " + Double.MIN_VALUE);
    }

    //Valid variable name
    public static void nameVariable(){
        int $nam = 23;
        int _nam = 25;
        int nam15 = 30;
        int nam$Nam = 40;
        int sumAll = $nam+_nam+ nam15+nam$Nam;

        System.out.println("All sum: " + sumAll);
    }



    //decimal to binary
    public static void decimalToBinary(){
        int nam1 = 5;
        int nam2 = -5;

        System.out.println("This is a decimal to binary number: "+Integer.toBinaryString(nam1));
        System.out.println("This is a decimal to binary number: "+Integer.toBinaryString(nam2));
    }

    //Print all unicode
    public static void uniCode(){
        for (char c=0x0370; c<=0x03FF; c++){
            System.out.print(c + " ");
        }
    }

    //calculate the triangle of area
    public static void calculateOfArea(){
        float base, height, area;
        System.out.println("Enter Base and Height: ");

        Scanner sc = new Scanner(System.in);
        base = sc.nextFloat();
        height = sc.nextFloat();

        area = base*height/2;

        System.out.println("Area of a Triangle is " + area);
    }


    // 3 side of Triangle area calculate
    public static void threeSideTriangleAreaCalculate(){
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        float s;
       double area;
        System.out.println("Enter 3 sides of Triangle ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

       s = (a + b + c)/2f;
       area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area is " + area);
    }


    // just sole the problem
    //ax2+bx+c=0
    public static void justSolveTheProblem(){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double r1, r2;

        System.out.println("Enter value of a, b and c: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        r1 = (-b+ Math.sqrt(b*b-4*a*c))/(2*a);
        r2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);

        System.out.println("Root are " + r1 + " "+ r2);
    }

    //IncDec check
    public static void incDec(){

        //byte
        byte nam1 = 4;
        nam1++;
        ++nam1;
        System.out.println(nam1);

        //short
        short nam2 = 15;
        nam2++;
        ++nam2;
        System.out.println(nam2);

        //integer
        int nam3 = 5;
        nam3++;
        ++nam3;
        System.out.println(nam3);

        //long
        long nam4 = 100;
        nam4++;
        ++nam4;
        System.out.println(nam4);

        //float
        float nam5 = 5.4f;
        nam5++;
        ++nam5;
        System.out.println(nam5);

        //double
        double nam6 = 10.5;
        nam6++;
        ++nam6;
        System.out.println(nam6);

        //char
        char ch = 'A';
        ch++;
        ++ch;
        System.out.println(ch);
    }

    public static void BitwiseDemo(){

        //decimal number
        int x1 = 10, y1 = 6, z1;

        //and operator
        z1 = x1&y1;
        System.out.println(z1);

        //binary number
        int x2 = 0b1010;
        int y2 = 0b0110;
        int z2, z3;

        //or operator
        z2 = x2|y2;

        //xor operator
        z3 = x2^y2;


        int x3 = 0b1;
        int y3;

        //left shift
        y3 = x3<<1;

        int x4 = 0b1000;
        int y4;

        //right sift
        y4 = x4>>1;

        System.out.println("Left sift "+y3);
        System.out.println("Right sift "+y4);
        System.out.println(z2);
        System.out.println(z3);
    }


    //printing
    public static void printing(){
        int x = 10, y = 20;
        float b = 12.55f;
        char c = 'A';
        String str = "Hello";
        String str1 = "Java Program";


        System.out.println(x + y);
        System.out.println("Number is " + y);
        System.out.printf("Hello\n");
        System.out.printf("Hello %s \n", str1);
        System.out.printf("%1$d %2$f %1$d", x, b);

        System.out.printf("\n%05d", x);
    }

    public static void StringPractice(){
        String str1 = "Java Program";
        String str2 = new String("JAVA");
        char c[]= {'H', 'e','l','l','o'};
        String str3 = new String(c);
        byte b[] = {65, 66, 67, 68};
        String str4 = new String(b);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        String str5 = "Parvez Ahmed";
        System.out.println(str5.startsWith("Parvez"));
        System.out.println(str5.endsWith("Ahmed"));

        String str6 = "Pyramid";
        String str7 = "Pyramid";
        System.out.println(str6.equals(str7));
        System.out.println(str6.compareTo(str7));

        String str8 = "A";
        System.out.println(str8.matches("[a-zA-Z0-9]"));
    }


    public static void SCString(){
        String str = "parvezahmez33@gmail.com";
        int i = str.indexOf("@");
        String uname = str.substring(0,i);
        String domain = str.substring(i+1, str.length());

        System.out.println("Username : " + uname);
        System.out.println("Domain : " + domain);
        System.out.println(domain.startsWith("gmail"));
    }

    public static void SCString1(){
        String str = "programmer@gmail.com";

        int i= str.indexOf("@");
        String uname = str.substring(0,i);
        System.out.println("Username : "+uname);
        String domain = str.substring(i+1, str.length());
        System.out.println("Domain : "+domain);

        int j = domain.indexOf(".");
        String name = domain.substring(0, j);
        System.out.println(name.equals("gmail"));
    }

    public static void SCString2(){
        String str = "a!B@c#1$2%3";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));

        String str1 = "       abc     def   gh   ijk   ";
        str1 = str1.replaceAll("\\s+"," ").trim();
        System.out.println(str1);
        String words[] = str1.split("\\s");
        System.out.println(words.length);
    }



    //Algebra Sequence — Boxes problem solve
    public static int algebraSequence(int step){
        if (step % 2 == 0) {
            return step;
        } else {
            return step + 2;
        }
    }

    //switch problem solve
    public static void SwitchProblemSolve(){
        int n = 1;
        if(n==1){
            System.out.println("One");
        } else if (n==2) {
            System.out.println("Two");
        } else if (n==3) {
            System.out.println("Three");
        }else{
            System.out.println("Not Valid");
        }


        int n1 = 3;

        switch (n){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Invalid");
        }
    }


    //one application
    public static void switch1(){

      Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day Number");
        int day=sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }

    //problem2 solve switch

    public static void switch2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Domain name: ");
        String domain = sc.nextLine();

        String ext = domain.substring(domain.lastIndexOf(".")+ 1);
        switch(ext){
            case "com":
                System.out.println("Commercial");
                break;
            case "org":
                System.out.println("Organisation");
                break;
            case "gov":
                System.out.println("Government");
                break;
            case "net":
                System.out.println("Network");
                break;

        }
    }
    public static void switch3(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        System.out.println("Enter 2 numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Option in words ");
        String option = sc.nextLine();
        option=option.toUpperCase();
        switch (option){
            case "ADD":
                System.out.println("Sum is " + (x +y));
                break;
            case "SUB":
                System.out.println("Difference is " + (x -y));
                break;
            case "MUL":
                System.out.println("Product is " + (x * y));
                break;
            case "DIV":
                System.out.println("Ratio " + (x /y));
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }

    }


    //////////////////loops related///////////////////
    public static void LoopPractice(){
        int i = 1;
        while (i<100){
            System.out.println(i);
            i=i*2;
        }
    }


    public static void SCLoop1(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int n= sc.nextInt();

        for(int i = 1; i<= 10; i++){
            System.out.println(n + "x" +i+"="+n*i);
        }
    }

    public static void SCLoop2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int n = sc.nextInt();

        int sum = 0;

        for (int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Sum of "+n+" Number is "+sum);
    }

    //factorial
    public static void factorial(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int n = sc.nextInt();

        long fact = 1;
        for (int i=1;i<=n; i++){
            fact = fact*i;
        }

        System.out.println("Factorial is "+fact);

    }

    public static void SCLoop3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();

        int r;
        int count=0;

        while (n>0){
            r=n%10;
            n=n/10;
            count++;

            System.out.println(r);
        }
        System.out.println("Total have number of count: "+count);
    }


    //Armstrong number
    public static void armstrongNumber(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int n= sc.nextInt();

        int m=n;
        int sum = 0;
        int r;
        while (n>0){
            r=n%10;
            n=n/10;

            sum=sum+r*r*r;
        }
        if(sum==m){
            System.out.println("Its a Armstrong Number");
        }else{
            System.out.println("Its not a Armstrong Number");
        }
    }

    //reverse the number
    public static void reverseTheNumber(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int n= sc.nextInt();

        int rev = 0,r;
        while (n>0){
            r=n%10;
            rev= rev*10+r;
            n/=10;
        }
        System.out.println("Reverse Number "+ rev);
    }


    public static void reverse1(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int n= sc.nextInt();
        int r;
        String str = "";
        while (n>0){
            r = n%10;
            n=n/10;
            str = str+r;
        }
        System.out.println(str);

        char c;
        for(int i=str.length()-1;i>=0;i--){
            c=str.charAt(i);
            switch (c){
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
            }
        }
    }

    //solve problem
    public static void SCLoop4(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to print AP Series");
        System.out.println("Enter a, d and n");
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        int term = a;
        for(int i=0; i<n; i++){
            System.out.println(term+ " ");
            term=term+d;
        }
    }

    public static void fibonacciSeries(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to Fibonacci Series");
        System.out.println("Enter number of Terms");
        int n= sc.nextInt();

        int a=0,b=1,c;

        System.out.print(a+","+b);
        for(int i=0;i<n-2;i++){
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }

    //nested loops
    public static void nestedLoops(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("("+i+","+j+") ");
            }
            System.out.println("");
        }
    }

    public static void patterns1(){
        int count = 0;
        for(int i=1; i<=5; i++){
            for (int j=1;j<=5;j++){
                count++;
                System.out.format("%02d ",count);
            }
            System.out.println("");
        }
    }

    public static void pattern2(){
        for(int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println("");
        }
    }

    public static void pattern3(){

        int count = 0;
        for(int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                count++;
                System.out.print(count+ " ");
            }
            System.out.println("");
        }
    }


    //////////////Array section///////////////////
    public static void arrayPractice(){
        int A[] = new int[10];
        int B[] ={1,2,3,4,5};
        int C[];
        C=new int[10];

        B[2]=15;

        for (int i=0; i<B.length;i++){
            System.out.println(B[i]);
        }

        for(int s:B){
            System.out.println(s);
        }
    }


    //solve problem of array1
    public static void SCArray1(){
        int A[] = {3,9,7,8,12,6,15,5,4,10};

        int sum = 0;

        for(int i=0;i<A.length;i++){
            sum = sum+A[i];
        }
        System.out.println("Sum is "+ sum);
    }

    //solve problem of array2
    public static void SCArray2(){
        Scanner sc = new Scanner(System.in);
        int A[] = {3,9,7,8,12,6,15,5,4,10};
        System.out.println("Enter a Key ");
        int key = sc.nextInt();

        for(int i=0;i<A.length;i++){
            if(key==A[i]){
                System.out.println("Element Found at: "+i);
                System.exit(0);
            }
        }
        System.out.println("Not Found");
    }

    //solve problem of array3
    public static   void SCArray3(){
        int A[] = {3,9,7,8,12,6,15,5,4,10};
        int max1, max2;

        max1=max2=A[0];
        for(int i=0;i<A.length;i++){

            if(A[i]>max1){
                max2 = max1;
                max1 = A[i];
            } else if (A[i]>max2) {
                max2=A[i];
            }
        }
        System.out.println("Second Largest is "+ max2);
    }


    public static void arrayPractice1(){
        int A[][] = new int[5][5];
        int B[][] = {{1,2,3},{2,4,6},{1,3,5}};

        //one way
       for(int i=0;i<B.length;i++){
           for (int j=0;j<B[0].length; j++){
               System.out.print(B[i][j]+" ");
           }
           System.out.println("");
       }
        System.out.println("");
       //two_way
        for(int x[]:B){
            for(int y:x){
                System.out.print(y+ " ");
            }
            System.out.println("");
        }
    }

    public static void arrayPractice2(){
        int A[][];
        A=new int[3][];

        A[0]=new int[5];
        A[1]=new int[3];
        A[2]=new int[8];

        for(int x[]:A){
            for (int y:x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }

    public static void arrayPractice3(){
        int A[][] = {{3,5,9},{7,6,2},{4,3,5}};
        int B[][] = {{1,5,2},{6,8,4},{3,9,7}};

        int C[][]= new int[3][3];

        for(int i=0;i<A.length;i++){
            for (int j=0;j<A[0].length;j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        for(int x[]:C){
            for (int y:x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }

    public static void arrayPractice4(){
        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B[][]={{1,0,0},{0,1,0},{0,0,1}};

        int C[][]=new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                C[i][j]=0;
                for(int k=0;k<3;k++){
                    C[i][j] = C[i][j] + A[i][k]*B[k][j];
                }
            }
        }
        for(int x[]: C){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }



    //some problem solve
    public static void someProblemSolve(){

        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");

        int age = sc.nextInt();
        System.out.println("I am "+ age + " years old.");
        sc.nextLine();
        System.out.println("Do you want to marrige this year? 'YES'-Y, 'NO'-N");
        String st = sc.nextLine();
        st.toUpperCase();

        if(st.equals("Y")){
            if(age>=20){
                System.out.println("You can marry. Congratulations. I wish your best life.");
                System.out.println("How much money do you use in your marrige for buy cloths?");
                int money = sc.nextInt();

                if(money>= 50000){
                    System.out.println("Oh! That's big amount. Maybe you have lots of money.");
                } else if (money>=30000) {
                    System.out.println("You are middle class. That is enough for buy cloths.");
                }else {
                    System.out.println("You are so tight. Ha ha ha.");
                }
            }else {
                System.out.println("You can't marry. Because you know what you're not perfect for marrige. Please attend your study.");
            }
        }else if(st.equals("N")){
            if(age>=20){
                System.out.println("You should marry. Because you're age is over to marrige. Don't lose the important time. ");
            }else {
                System.out.println("You're already not perfect to marrige. Thank you select NO.");
            }
        }else {
            System.out.println("This is invalid.");
        }
    }

    public static void idobashiCustomar(){
        //make question
        Scanner sc = new Scanner(System.in);

        //check what sim card use customar right now
        System.out.println("Irassaimase");
        System.out.println("What kind of sim card you're you use right now? If you use 'Y!Mobile or SoftBank' Please enter S, use 'Rakuten'- R,'Docomo ahamo irumo'- D and 'Au or Uq'- K");
        String st1 =sc.nextLine().toUpperCase();
        switch (st1){
            case "S":
                System.out.println("What you're use? Y!mobile - Y or SoftBank - S ?");
                String st2 = sc.nextLine().toUpperCase();
                sc.nextLine();
                if(st2.equals("Y")){
                    System.out.println("You're using Y!mobile. How's Y!mobile? Is it network and call is good? Yes- Y, No- N");
                    String st3 = sc.nextLine().toUpperCase();
                    if(st3.equals("Y")){
                        System.out.println("That's good. You should use continue Y!mobile. Maybe it's better for you.");
                    }else {
                        System.out.println("You should to change another company. What about Uq mobile Sim. If you change to day I give 20,000pt of idobashi point.");
                    }
                }else {
                    System.out.println("You're using SoftBank. How's SoftBank? Is it network and call is good? Yes- Y, No- N");
                    String st3 = sc.nextLine().toUpperCase();
                    if(st3.equals("Y")){
                        System.out.println("That's good. You should use continue SoftBank. Maybe it's better for you.");
                    }else {
                        System.out.println("You should to change this sim card to another company. What about Uq mobile Sim. If you change to day I give 20,000pt of idobashi point.");
                    }
                }
                break;
            case "R":
                System.out.println("How's Rakuten? Is network and call is good? Yes- Y and No- N");
                String st4=sc.nextLine().toUpperCase();
                if(st4.equals("Y")){
                    System.out.println("You should use continue this Rakuten sim.");
                }else {
                    System.out.println("You should to change this sim card to another company. What about Uq mobile Sim. If you change to day I give 20,000pt of idobashi point.");
                }
                break;
            case "D":
                System.out.println("How's internet and call Docomo, ahamo and irumo? Is it good-> G and bed->B");
                String st5=sc.nextLine().toUpperCase();
                if(st5.equals("G")){
                    System.out.println("You should use continue this sim card");
                }else {
                    System.out.println("You should to change this sim card to another company. What about Uq mobile Sim. If you change to day I give 20,000pt of idobashi point.");
                }
                break;
            case "K":
                System.out.println("You should use continue. This is a best sim and network in the Japan.");
                break;
            default:
                System.out.println("Something was wrong.");

        }

    }

    public static void arrayP1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many friends name do you want to take?");
        int nam = sc.nextInt();

        System.out.println("Enter your friends name: ");
        ArrayList<String> ary = new ArrayList<>();
        for(int i=1; i<=nam;i++){
            String str = sc.nextLine();
            ary.add(str);
        }
        System.out.println("This is your friends name. Right?");

        for(String str: ary){
            System.out.println(str);
        }
        String answer = sc.nextLine().toUpperCase();

        if(answer.equals("YES")){
            System.out.println("Okey. Thank you so much.");
        }else {
            System.out.println("Somethings else.");
        }
    }

    public static void array2(){
        String arr[]={"java","python","pascal","smalltalk", "ada","basic"};
        java.util.Arrays.sort(arr);

        for(String x:arr){
            System.out.println(x);
        }
    }

    //check prime number or not
    public static boolean isPrime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
}


//check gdc
    public static int gdc(int m, int n){
        while (m!=n){
            if(m>n)m=m-n;
            else n=n-m;
        }
        return m;
    }


    //max number check
    public static int max(int x, int y, int z){

        if(x>y && x>z){
            return x;
        } else if (y>z) {
            return y;
        }else {
            return z;
        }
    }

    //max number check manuel a lots of number
    public static int Max(int ...x){
        if(x.length==0)return Integer.MIN_VALUE;
        int max =x[0];

        for(int i = 0; i<x.length;i++){

            if(x[i]>max){
                max = x[i];
            }
        }
        return max;
    }

    public static void showList(String ...S){
        for (int i = 0; i<S.length;i++){
            System.out.println(i+1+". "+S[i]);
        }
    }

    public static void main(String[] args)  {
        System.out.println(Max());
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