package com.example.android.myapplication;

/**
 * Created by android on 30/09/2017.
 */

public class Metodos {

    public static double calular(double posicion,double posicion1,double posicion2) {
        double var = 0;

        if (posicion == 0) {
            if (posicion1 == 0) {
                if (posicion2 == 0) {
                    var = 130.000;
                } else {
                    if (posicion2 == 1) {
                        var = 140.000;
                    } else {
                        if (posicion2 == 2) {
                            var = 120.000;
                        }
                    }
                }
            } else {
                if (posicion2 == 0) {
                    var = 100.000;
                } else {
                    if (posicion2 == 1) {
                        var = 80.000;
                    } else {
                        if (posicion2 == 2) {
                            var = 50.000;
                        }
                    }
                }

            }

        } else {
            if (posicion == 1) {
                if (posicion1 == 0) {
                    if (posicion2 == 0) {
                        var = 110.000;
                    } else {
                        if (posicion2 == 1) {
                            var = 130.000;
                        } else {
                            if (posicion2 == 2) {
                                var = 100.000;
                            }
                        }
                    }
                } else {
                    if (posicion2 == 0) {
                        var = 120.000;
                    } else {
                        if (posicion2 == 1) {
                            var = 70.000;
                        } else {
                            if (posicion2 == 2) {
                                var = 60.000;
                            }
                        }
                    }

                }

            }
        }

        return var;

    }



}
