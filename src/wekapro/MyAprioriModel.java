/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wekapro;

import weka.associations.Apriori;
import weka.core.Instances;

/**
 *
 * @author Le Ba Quoc Truong
 */
public class MyAprioriModel extends MyKnowledgeModel {
    Apriori apriori;
    Instances newdata;

    public MyAprioriModel() {
    }

    public MyAprioriModel(String filename, String m_opts, String d_opts) throws Exception {
        super(filename, m_opts, d_opts);
        this.apriori = new Apriori();
    }

    MyAprioriModel(String cProgram_FilesWeka386datairisarff) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void mineAssociationRules() throws Exception{
        //Loc du lieu
//      this.newdata = removeData(this.dataset);
        //this.newdata = convertData(this.dataset);
        // Thiet lap thong so cho model Apriori
        apriori.setOptions(this.model_options);
        //Khai pha luat ket hop bang thuat toan Apriori
        apriori.buildAssociations(this.newdata);
    }

    @Override
    public String toString() {
        return apriori.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
