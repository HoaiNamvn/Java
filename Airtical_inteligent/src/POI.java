/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doanh
 */
public class POI{
    public static void main(String[] args){
        int[][][] template={{{40,50},{60,20},{90,50}},
                            {{45,55},{63,27},{83,50}},
                            {{45,50},{60,25},{85,55}}};
        int[][] input={{43,52},{62,23},{87,52}};

        double mindistance = -1;
        int minclass = -1;

        for(int category=0; category<template.length; category++){
            System.out.print("Class"+category+":");
            for(int point=0; point<template[category].length; point++){
                System.out.print("("+template[category][point][0]+","+template[category][point][1]+"),");
            }
            System.out.println();
        }

        System.out.print("Input:");
        for(int point=0; point<input.length; point++){
            System.out.print("("+input[point][0]+","+input[point][1]+"),");
        }
        System.out.println();

        for(int category=0; category<template.length; category++){
            double d=0;
            for(int point=0; point<template[category].length; point++){
                int x1 = template[category][point][0];
                int x2 = input[point][0];
                int y1 = template[category][point][1];
                int y2 = input[point][1];
                d+= ((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2));
            }
            System.out.println("Distance"+category+":"+d);
            if(mindistance==-1 || d<mindistance){
                mindistance=d;
                minclass=category;
            }
        }

        System.out.println("Nearest class:"+minclass+" distance:"+mindistance);

    }
}

