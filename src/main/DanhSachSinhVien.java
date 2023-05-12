package main;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien {
    private static ArrayList<SinhVien> danhsach;
    private Scanner sc;
    public DanhSachSinhVien(){
        danhsach = new ArrayList<SinhVien>();
    }
    public DanhSachSinhVien(ArrayList<SinhVien> danhsach) {
        DanhSachSinhVien.danhsach = danhsach;
    }

    public void AddStudent(SinhVien sv){
        danhsach.add(sv);
    }
    public void ShowInfor() {
        for (SinhVien sinhVien : danhsach) {
            System.out.println(sinhVien);
        }
    }

    public int findById(String id){
        for (SinhVien sinhVien:danhsach) {
            if(sinhVien.getId().equals() )
        }
        return
    }
    public void editStudent(){
        System.out.println("Enter index you want to edit: ");
        int indexOfStudent = sc.nextInt();

        System.out.println("which options do you want to edit: \n"
                        + "1. Edit id of student. \n"
                        + "2. Edit name of student. \n"
                        + "3. Edit date of birth. \n"
                        + "4. Edit average mark. \n"
        );
        int choice = sc.nextInt();
        while(choice > 4 || choice < 1){
            System.out.println("Please, enter 1 to 3, again: ");
            choice = sc.nextInt();
        }
        switch (choice){
            case 1:
                System.out.println("Set id: ");
                String idEdit = sc.nextLine();
                danhsach.get(indexOfStudent).setId(idEdit);
                break;
            case 2:
                System.out.println("Set name: ");
                String nameEdit = sc.nextLine();
                danhsach.get(indexOfStudent).setName(nameEdit);
                break;
            case 3:
                System.out.println("Set date of birth: ");
                int dobEdit = sc.nextInt();
                danhsach.get(indexOfStudent).setDob(dobEdit);
                break;
            case 4:
                System.out.println("Set average mark: ");
                float dtbEdit = sc.nextFloat();
                danhsach.get(indexOfStudent).setDtb(dtbEdit);
                break;
        }
    }
}
