package id.ac.poliban.e020320041.wisataappe020320041.model;

/**
 * Created by Azhar Rivaldi on 22-12-2019.
 */

public class ModelMain {

    private String txtName;
    private int imgSrc;

    public ModelMain(String txtName, int imgSrc) {
        this.txtName = txtName;
        this.imgSrc = imgSrc;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public int getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(int imgSrc) {
        this.imgSrc = imgSrc;
    }

}
