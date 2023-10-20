public class PracticeFile01 {
    String name;
    String address;

    PracticeFile01(String a, String b){
        this.name = a;
        this.address = b;
        callTheFunction();
    }

    public void callTheFunction(){
        PracticeFile02 file02 = new PracticeFile02();
        file02.showData(name, address);
        new BranchTest().testing();
    }

}
