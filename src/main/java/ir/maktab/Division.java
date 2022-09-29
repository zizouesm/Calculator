package ir.maktab;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Division {
    private int num1;
    private int num2;

    public Division() {
    }
    public double division() throws InvalidInputException {
        if(this.num2!=0){
            return (this.num1/this.num2);
        }
        else {
           throw new InvalidInputException("Number 2 Can't Be Zero");
         //   throw new RuntimeException("Invalid");
        }
    }
}
