package org.ucode;

import java.io.File;

public class Start {

    public static void main(String[] args) {
        File dir = new File(System.getProperty("user.dir") + File.separator + "base");
        File[] files = dir.listFiles();
        boolean result = true;

        File CRGN = new File(System.getProperty("user.dir") + File.separator + "work" + File.separator + "use_crgn");
        File REGN = new File(System.getProperty("user.dir") + File.separator + "work" + File.separator + "use_regn");
        if (!CRGN.exists()) {
            CRGN.mkdir();
        }
        if (!REGN.exists()) {
            REGN.mkdir();
        }
        for (File file : files != null ? files : new File[0]) {
            if (!result) {
                System.out.println("파일 이름 변경 실패");
            }
            String filename = file.getName();
            System.out.println(filename + "파일을 불러왔습니다.");
            if (file.getName().contains("제1종전용주거지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_regn" + File.separator + "UQA111." + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("제2종전용주거지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_regn" + File.separator + "UQA112" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("제1종일반주거지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_regn" + File.separator + "UQA121" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("제2종일반주거지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_regn" + File.separator + "UQA122" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("제3종일반주거지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_regn" + File.separator + "UQA123" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("준주거지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_regn" + File.separator + "UQA130" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("중심상업지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_regn" + File.separator + "UQA210" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("일반상업지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_regn" + File.separator + "UQA220" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("근린상업지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_regn" + File.separator + "UQA230" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("유통상업지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_regn" + File.separator + "UQA240" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("전용공업지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_regn" + File.separator + "UQA310" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("일반공업지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_regn" + File.separator + "UQA320" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("준공업지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_regn" + File.separator + "UQA330" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("보전녹지지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_regn" + File.separator + "UQA410" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("생산녹지지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_regn" + File.separator + "UQA420" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("자연녹지지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_regn" + File.separator + "UQA430" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("관리지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_regn" + File.separator + "UQB001" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("계획관리지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_regn" + File.separator + "UQB100" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("생산관리지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_regn" + File.separator + "UQB200" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("보전관리지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_regn" + File.separator + "UQB300" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("농림지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_regn" + File.separator + "UQC001" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("개발제한지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_regn" + File.separator + "UDV100" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("자연환경보전지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_regn" + File.separator + "UQD001" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("교통시설")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_crgn" + File.separator + "UQ161" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("공간시설")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_crgn" + File.separator + "UQ162" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("유통및공급시설")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_crgn" + File.separator + "UQ163" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("공공문화체육시설")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_crgn" + File.separator + "UQ164" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("방재시설")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_crgn" + File.separator + "UQ165" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("보건위생시설")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_crgn" + File.separator + "UQ166" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("환경기초시설")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_crgn" + File.separator + "UQ167" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("기타기반시설")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "use_crgn" + File.separator + "UQ168" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("하천-용도구역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UJ201" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("소하천-소하천구역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UJ301" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("초지")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UF401" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("건축-용도지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UD201" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("경기도조례-문화재보호")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "ZH002" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("공공주택-용도지구")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UD620" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("국민임대주택-용도지구")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UD610" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("국토계획-경관지구")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UQ121" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("국토계획-구역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UQ141" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("국토계획-도시지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UQ111" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("국토계획-미관지구")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UQ122" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("국토계획-복합용도지구")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UQ132" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("국토계획-취락지구")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UQ128" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("국토계획-특정용도제한지구")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UQ130" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("군사시설보호")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UF401" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("농업진흥지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UE101" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("도로-용도구역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UI101" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("도시및주거환경정비-정비구역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UD602" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("재정비촉진지구")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UD603" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("문화재-문화재보호")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UO301" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("사방사업-사방지")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UF301" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("이용형태에따른산림")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UF132" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("산림자원조성관리")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UF141" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("산업입지-산업단지")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UH101" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("가축사육제한구역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UM000" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("개발제한구역지관리-개발제한구역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UD801" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("민간임대주택-용도지구")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UD622" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("산업집적활성화및공장설립-용도지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UH211" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("산지관리-보전준보전산지")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UF801" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("자연공원-용도구역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UM101" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("자연공원-용도지구")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UM102" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("전원개발-용도구역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UL201" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("전통사찰-전통사찰보존")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UO501" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("중점경관관리구역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "ZQ001" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("지역-수도권정비권역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UD101" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("지역개발사업구역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UB950" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("지역특화발전규제-특구")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UB210" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("철도안전-용도지역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UI310" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("택지개발-택지개발예정구역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UD301" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("토지구획정리사업지구")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UD401" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("학교환경위생정화구역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UO101" + filename.substring(filename.lastIndexOf("."))));
            } else if (file.getName().contains("한강수계-수변구역")) {
                result = file.renameTo(new File(System.getProperty("user.dir") + File.separator + "work"
                        + File.separator + "UM730" + filename.substring(filename.lastIndexOf("."))));
            }
            else {
                result = false;
            }
        }
        System.out.println("작업 완료.");
        System.exit(0);
    }
}
