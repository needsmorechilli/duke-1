public class ToDo extends Task {

    protected String description;

    public ToDo(String description) {
        super(description);
    }
    /*
        System.out.println("Got it. I've added this task: ");
        System.out.println("    " + "[T] " + "[" + store[TaskNo-1].getStatusIcon() + "] "+ store[TaskNo-1]););
        for (int i = 1; i < num.length; i++){ //skip 0 as text, looking for the number
            //int TaskNo = Integer.parseInt(num[i]); //change string to No
            if (store[TaskNo-1] != null ){ //to check that input is in list
                Task t = store[TaskNo-1];
                t.markAsDone();
                System.out.println("[" + store[TaskNo-1].getStatusIcon() + "] "+ store[TaskNo-1]);
            }
        }
    }*/

    @Override
    public String toString(){
        return "[T]" + super.toString();
    }
}
