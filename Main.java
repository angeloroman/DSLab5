class Main {
  public static void main(String[] args) {
    exercise5();
  }

  public static void printLinkedList (Lab05P3Wrapper.SinglyLinkedList l){ // to print exercise 5
    if (l.size() == 0){
      System.out.println("Empty List");
    }
    for (int i=0; i<l.size(); i++){
      System.out.println(l.get(i));
    }
  }


  public static void printLinkedList (Lab05P2Wrapper.SinglyLinkedList l){ // to print exercise 4
    if (l.size() == 0){
      System.out.println("Empty List");
    }
    for (int i=0; i<l.size(); i++){
      System.out.println(l.get(i));
    }
  }

  public static void printLinkedList (Lab05P1Wrapper.SinglyLinkedList l){ // to print exercise 3
    if (l.size() == 0){
      System.out.println("Empty List");
    }
    for (int i=0; i<l.size(); i++){
      System.out.println(l.get(i));
    }
  }

  public static void printLinkedList (LinkedListWrapper.LinkedList l){ // to print exercise 2
    if (l.size() == 0){
      System.out.println("Empty List");
    }
    for (int i=0; i<l.size(); i++){
      System.out.println(l.get(i));
    }
  }

  public static void exercise2(){
    LinkedListWrapper.LinkedList secondExercise = new LinkedListWrapper.LinkedList();

    secondExercise.add(4050);
    secondExercise.add(4060);
    secondExercise.add(3081);
    secondExercise.add(4082);
    secondExercise.add(309);
    secondExercise.add(3081);

    printLinkedList(secondExercise);
    System.out.println("Testing clear()");
    secondExercise.clear(); // working
    printLinkedList(secondExercise);

    secondExercise.add(4050);
    secondExercise.add(4060);
    secondExercise.add(3081);
    secondExercise.add(4082);
    secondExercise.add(309);
    secondExercise.add(3081);


    // System.out.println("Testing remove()"); // working
    // secondExercise.remove(309);
    // printLinkedList(secondExercise);

    System.out.println("Testing removeAll()"); // working
    secondExercise.removeAll(3081);
    printLinkedList(secondExercise);


    secondExercise.add(4050);
    secondExercise.add(4060);
    secondExercise.add(3081);
    secondExercise.add(4082);
    secondExercise.add(309);
    secondExercise.add(3081);


    System.out.println("Testing contains()"); // working
    if (secondExercise.contains(309)){
      System.out.println("It is there");
    }else{
      System.out.println("It is not there");
    }
    printLinkedList(secondExercise);

    System.out.println("Testing firstIndex()"); // working
    System.out.println(secondExercise.firstIndex(3081));
    printLinkedList(secondExercise);

    System.out.println("Testing lastIndex()"); // working
    System.out.println(secondExercise.lastIndex(3081));
    printLinkedList(secondExercise);

    System.out.println("Testing isEmpty() when not empty");
    if (secondExercise.isEmpty()){ // working
      System.out.println("like me");
    }else{
      System.out.println("Just like my spheres");
    }
    printLinkedList(secondExercise);

    secondExercise.clear();

    System.out.println("Testing isEmpty() when empty");
    if (secondExercise.isEmpty()){ // working
      System.out.println("like me");
    }else{
      System.out.println("Just like my spheres");
    }
  }

  public static void exercise3(){
    Lab05P1Wrapper.SinglyLinkedList thirdExercise = new Lab05P1Wrapper.SinglyLinkedList();

    // thirdExercise.add(432);
    // thirdExercise.add(4543);
    // thirdExercise.add(9843);
    // thirdExercise.add(243);
    // thirdExercise.add(473);
    // thirdExercise.add(945);
    // thirdExercise.add(627);
    // thirdExercise.add(844);
    // thirdExercise.add(213);
    // thirdExercise.add(534);
    // thirdExercise.add(657);
    // thirdExercise.add(764);

    // strings
    thirdExercise.add("Genshin Impact");
    thirdExercise.add("Fortnite");
    thirdExercise.add("Pokemon GO");
    thirdExercise.add("Paladins");
    thirdExercise.add("Minecraft");
    thirdExercise.add("Muck");
    thirdExercise.add("Among Us");
    thirdExercise.add("Life is Strange");


    // printLinkedList(thirdExercise);

    // System.out.println("\n\n");

    thirdExercise.reverse();

    printLinkedList(thirdExercise);
  }

  public static void exercise4(){
    Lab05P2Wrapper.SinglyLinkedList fourthExercise = new Lab05P2Wrapper.SinglyLinkedList();

    fourthExercise.add(1);
    fourthExercise.add(2);
    fourthExercise.add(3);
    fourthExercise.add(4);
    fourthExercise.add(5);
    fourthExercise.add(6);
    fourthExercise.add(7);
    fourthExercise.add(8);
    fourthExercise.add(9);

    fourthExercise.changeOddEven();

    printLinkedList(fourthExercise);
  }

  public static void exercise5(){
    Lab05P3Wrapper.SinglyLinkedList fifthExercise = new Lab05P3Wrapper.SinglyLinkedList();

    fifthExercise.add("Genshin Impact");
    fifthExercise.add("Fortnite");
    fifthExercise.add("Pokemon GO");
    fifthExercise.add("Minecraft");
    fifthExercise.add("Muck");
    fifthExercise.add("Among Us");
    fifthExercise.add("Life is Strange");

    fifthExercise.addBefore("Paladins", "Paladins");

    // fifthExercise.addBefore("Minecraft", "Paladins");
    // fifthExercise.addBefore("Minecraft", "Paladins");
    // fifthExercise.addBefore("Minecraft", "Paladins");
    // fifthExercise.addBefore("Minecraft", "Paladins");

    printLinkedList(fifthExercise);
  }
}