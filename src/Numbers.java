import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Numbers {
    private List<String> zerohroughnine;
    private List<String> onethroughnine;
    public List<String> tenthroughninety;
    private List<String> hundredandthousand;
    private List<String> modifiedNumberString;


    public Numbers() {
        this.zerohroughnine = new ArrayList<>();
        this.zerohroughnine.addAll(Arrays.asList("SIFIR", "BİR", "İKİ", "ÜÇ", "DÖRD", "BEŞ", "ALTI", "YEDDİ", "SƏKKİZ", "DOQQUZ"));

        this.onethroughnine = new ArrayList<>();
        this.onethroughnine.addAll(Arrays.asList("", "BİR", "İKİ", "ÜÇ", "DÖRD", "BEŞ", "ALTI", "YEDDİ", "SƏKKİZ", "DOQQUZ"));

        this.tenthroughninety = new ArrayList<>();
        this.tenthroughninety.addAll(Arrays.asList("", "ON", "İYİRMİ", "OTUZ", "QİRX", "ƏLLİ", "ALTMIŞ", "YETMİŞ", "SƏKSƏN", "DOQSAN"));

        this.hundredandthousand = new ArrayList<>();
        this.hundredandthousand.addAll(Arrays.asList("YÜZ", "MİN"));

        this.modifiedNumberString = new ArrayList<>();
    }

    public List<String> modifyStringforNumber(String range) {
        String numberString = null;


        if (range.equals("0-100")) {
            for (String x : this.tenthroughninety) {
                for (String y : this.zerohroughnine) {
                    if (x.equals(""))
                        numberString = y;
                    else if (!y.equals("SIFIR")) {
                        numberString = x + " " + y;
                    }
                    this.modifiedNumberString.add(numberString);

                }
            }

        } else if (range.equals("100-200")) {
            for (String q : this.onethroughnine) {
                if (q.equals("BİR")) {
                    for (String x : this.hundredandthousand) {
                        if (!x.equals("MİN")) {
                            for (String y : this.tenthroughninety) {
                                for (String z : this.onethroughnine) {
                                    if (y.equals("")&&z.equals("")) {
                                        numberString = q + " " + x;
                                    } else if(y.equals("") && !z.equals("")){
                                        numberString = q + " " + x + " " + z;
                                    }else {
                                        numberString = q + " " + x + " " + y + " " + z;
                                    }
                                    this.modifiedNumberString.add(numberString);
                                }

                            }

                        } else {
                            numberString = "İKİ YÜZ";
                            modifiedNumberString.add(numberString);
                        }
                    }
                }
            }
        }else if (range.equals("200-300")) {
            for (String q : this.onethroughnine) {
                if (q.equals("İKİ")) {
                    for (String x : this.hundredandthousand) {
                        if (!x.equals("MİN")) {
                            for (String y : this.tenthroughninety) {
                                for (String z : this.onethroughnine) {
                                    if (y.equals("")&&z.equals("")) {
                                        numberString = q + " " + x;
                                    } else if(y.equals("") && !z.equals("")){
                                        numberString = q + " " + x + " " + z;
                                    }else {
                                        numberString = q + " " + x + " " + y + " " + z;
                                    }
                                    this.modifiedNumberString.add(numberString);
                                }

                            }

                        } else {
                            numberString = "ÜÇ YÜZ";
                            modifiedNumberString.add(numberString);
                        }
                    }
                }
            }
        }else if (range.equals("300-400")) {
            for (String q : this.onethroughnine) {
                if (q.equals("ÜÇ")) {
                    for (String x : this.hundredandthousand) {
                        if (!x.equals("MİN")) {
                            for (String y : this.tenthroughninety) {
                                for (String z : this.onethroughnine) {
                                    if (y.equals("")&&z.equals("")) {
                                        numberString = q + " " + x;
                                    } else if(y.equals("") && !z.equals("")){
                                        numberString = q + " " + x + " " + z;
                                    }else {
                                        numberString = q + " " + x + " " + y + " " + z;
                                    }
                                    this.modifiedNumberString.add(numberString);
                                }

                            }

                        } else {
                            numberString = "DÖRD YÜZ";
                            modifiedNumberString.add(numberString);
                        }
                    }
                }
            }
        }else if (range.equals("400-500")) {
            for (String q : this.onethroughnine) {
                if (q.equals("DÖRD")) {
                    for (String x : this.hundredandthousand) {
                        if (!x.equals("MİN")) {
                            for (String y : this.tenthroughninety) {
                                for (String z : this.onethroughnine) {
                                    if (y.equals("")&&z.equals("")) {
                                        numberString = q + " " + x;
                                    } else if(y.equals("") && !z.equals("")){
                                        numberString = q + " " + x + " " + z;
                                    }else {
                                        numberString = q + " " + x + " " + y + " " + z;
                                    }
                                    this.modifiedNumberString.add(numberString);
                                }

                            }

                        } else {
                            numberString = "BEŞ YÜZ";
                            modifiedNumberString.add(numberString);
                        }
                    }
                }
            }
        }else if (range.equals("500-600")) {
            for (String q : this.onethroughnine) {
                if (q.equals("BEŞ")) {
                    for (String x : this.hundredandthousand) {
                        if (!x.equals("MİN")) {
                            for (String y : this.tenthroughninety) {
                                for (String z : this.onethroughnine) {
                                    if (y.equals("")&&z.equals("")) {
                                        numberString = q + " " + x;
                                    } else if(y.equals("") && !z.equals("")){
                                        numberString = q + " " + x + " " + z;
                                    }else {
                                        numberString = q + " " + x + " " + y + " " + z;
                                    }
                                    this.modifiedNumberString.add(numberString);
                                }

                            }

                        } else {
                            numberString = "ALTI YÜZ";
                            modifiedNumberString.add(numberString);
                        }
                    }
                }
            }
        }else if (range.equals("600-700")) {
            for (String q : this.onethroughnine) {
                if (q.equals("ALTI")) {
                    for (String x : this.hundredandthousand) {
                        if (!x.equals("MİN")) {
                            for (String y : this.tenthroughninety) {
                                for (String z : this.onethroughnine) {
                                    if (y.equals("")&&z.equals("")) {
                                        numberString = q + " " + x;
                                    } else if(y.equals("") && !z.equals("")){
                                        numberString = q + " " + x + " " + z;
                                    }else {
                                        numberString = q + " " + x + " " + y + " " + z;
                                    }
                                    this.modifiedNumberString.add(numberString);
                                }

                            }

                        } else {
                            numberString = "YEDDİ YÜZ";
                            modifiedNumberString.add(numberString);
                        }
                    }
                }
            }
        }else if (range.equals("700-800")) {
            for (String q : this.onethroughnine) {
                if (q.equals("YEDDİ")) {
                    for (String x : this.hundredandthousand) {
                        if (!x.equals("MİN")) {
                            for (String y : this.tenthroughninety) {
                                for (String z : this.onethroughnine) {
                                    if (y.equals("")&&z.equals("")) {
                                        numberString = q + " " + x;
                                    } else if(y.equals("") && !z.equals("")){
                                        numberString = q + " " + x + " " + z;
                                    }else {
                                        numberString = q + " " + x + " " + y + " " + z;
                                    }
                                    this.modifiedNumberString.add(numberString);
                                }

                            }

                        } else {
                            numberString = "SƏKKİZ YÜZ";
                            modifiedNumberString.add(numberString);
                        }
                    }
                }
            }
        }else if (range.equals("800-900")) {
            for (String q : this.onethroughnine) {
                if (q.equals("SƏKKİZ")) {
                    for (String x : this.hundredandthousand) {
                        if (!x.equals("MİN")) {
                            for (String y : this.tenthroughninety) {
                                for (String z : this.onethroughnine) {
                                    if (y.equals("")&&z.equals("")) {
                                        numberString = q + " " + x;
                                    } else if(y.equals("") && !z.equals("")){
                                        numberString = q + " " + x + " " + z;
                                    }else {
                                        numberString = q + " " + x + " " + y + " " + z;
                                    }
                                    this.modifiedNumberString.add(numberString);
                                }

                            }

                        } else {
                            numberString = "DOQQUZ YÜZ";
                            modifiedNumberString.add(numberString);
                        }
                    }
                }
            }
        }else if (range.equals("900-1000")) {
            for (String q : this.onethroughnine) {
                if (q.equals("DOQQUZ")) {
                    for (String x : this.hundredandthousand) {
                        if (!x.equals("MİN")) {
                            for (String y : this.tenthroughninety) {
                                for (String z : this.onethroughnine) {
                                    if (y.equals("")&&z.equals("")) {
                                        numberString = q + " " + x;
                                    } else if(y.equals("") && !z.equals("")){
                                        numberString = q + " " + x + " " + z;
                                    }else {
                                        numberString = q + " " + x + " " + y + " " + z;
                                    }
                                    this.modifiedNumberString.add(numberString);
                                }

                            }

                        } else {
                            numberString = "MİN";
                            modifiedNumberString.add(numberString);
                        }
                    }
                }
            }
        }

        return modifiedNumberString;
    }

}
