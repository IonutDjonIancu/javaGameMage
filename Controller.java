package org.gameloft.second;

public class Controller
{
    Controller(  )
    {


    }

//=================== log display functions ==========

    static void saveNotification()
    {
        System.out.println( "saving..." );
    }

    static double funcDisplayResultOfAttack ( double a )
    {
        System.out.println( "result is = " + a );
        return a;
    }

//=================== log action functions ==========

    static double funcMageAttack( double a, double b )
    {
        return a - b ;
    }

    static int funcNpcAttack ( int a, int b )
    {
        return a - b;
    }

}

