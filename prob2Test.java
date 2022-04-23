import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class prob2Test {

@Test
    public void inequilibrium(){
    int [] test1arrx={3,-1,7};
    int [] test1arry={-5,2,-4};
    int [] test1arrz={2,-1,-3};

    int [] test2arrx={-4,3,1,-4};
    int [] test2arry={-3,-6,-5,2};
    int [] test2arrz={7,4,3,2};


    int [] test3arrx={-2,3,-4,-66,30};
    int [] test3arry={-5,-4,-4,45,20};
    int [] test3arrz={2,8,6,21,-50};

    assertEquals ("YES", prob2.checkequilibrium( 3 , test1arrx,test1arry,test1arrz ));
    assertEquals ("YES", prob2.checkequilibrium( 4 , test2arrx,test2arry,test2arrz ));
    assertEquals ("YES", prob2.checkequilibrium( 5 , test3arrx,test3arry,test3arrz ));
}
@Test
    public void notinequilibrium(){
        int [] test1arrx={3,-1,7,91,36,1,4,29,70,-2};
        int [] test1arry={-15,2,-41,3,36,12,13,31,5,-20};
        int [] test1arrz={2,-1,-3,-41,-7,60,19,31,23,13};

        int [] test2arrx={-4,23,1,95};
        int [] test2arry={-3,-6,-15,2};
        int [] test2arrz={17,4,36,2};


        int [] test3arrx={-57,7};
        int [] test3arry={-34,-4};
        int [] test3arrz={-2,29};
        assertEquals ("NO", prob2.checkequilibrium( 10 , test1arrx,test1arry,test1arrz ));
        assertEquals ("NO", prob2.checkequilibrium( 4 , test2arrx,test2arry,test2arrz ));
        assertEquals ("NO", prob2.checkequilibrium( 2 , test3arrx,test3arry,test3arrz ));
    }
@Test
public void notinrange(){
    int [] test1arrx={3,-1,7};
    int [] test1arry={-5,2,-4};
    int [] test1arrz={2,-1,-3};

    int [] test2arrx={-400,3,1,-4};
    int [] test2arry={-3,-6,-5,20};
    int [] test2arrz={7,4,3,2};


    int [] test3arrx={-2,3,-4,-66,30};
    int [] test3arry={-5,-4,200,45,20};
    int [] test3arrz={2,8,6,21,20};

    int [] test4arrx={-2,3,-4,-66,30};
    int [] test4arry={-5,-4,20,45,20};
    int [] test4arrz={2,8,6,21,200};

    assertEquals ("input n out of range", prob2.checkequilibrium( 0 , test1arrx,test1arry,test1arrz ));
    assertEquals ("input x0 out of range", prob2.checkequilibrium( 4 , test2arrx,test2arry,test2arrz ));
    assertEquals ("input y2 out of range", prob2.checkequilibrium( 5 , test3arrx,test3arry,test3arrz ));
    assertEquals ("input z4 out of range", prob2.checkequilibrium( 5 , test4arrx,test4arry,test4arrz ));
}

}