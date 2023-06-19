abstract class Bank{
     abstract int getRateOfInterest();
}
class SBI extends Bank{
    int getRateOfInterest() {
        return 5;
    }
}
class PNB extends Bank {
    int getRateOfInterest() {
        return 7;
    }

}
