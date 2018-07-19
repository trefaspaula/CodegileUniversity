package com.codegile.paula.week2.day1.problem2;

public class WritingObject extends TheObject implements WritingUtensil {
    public Integer thickness;

    public void penMethod(Pen p) {
        p.infoPen();
        p.namePen();
    }

    public void pencilMethod(Pencil p) {
        p.infoPencil();
        p.namePencil();
    }

    public void stickMethod(Stick s) {
        s.infoStick();
        s.nameStick();
    }

    public void writingUtensil(WritingUtensil wu) {
        wu.resistence();
    }

    @Override
    public void resistence() {
        System.out.print("resistence");
    }

    @Override
    public void namePen() {
        System.out.print("NamePen");
    }

    @Override
    public void infoPen() {
        System.out.print("InfoPen");
    }

    @Override
    public void namePencil() {
        System.out.print("NamePencil");
    }

    @Override
    public void infoPencil() {
        System.out.print("InfoPencil");
    }

    @Override
    public void nameStick() {
        System.out.print("NameStick");
    }

    @Override
    public void infoStick() {
        System.out.print("InfoStick");
    }
}
