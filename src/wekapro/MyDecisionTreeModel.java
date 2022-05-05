/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wekapro;

import weka.classifiers.Evaluation;
import weka.classifiers.trees.J48;
import weka.core.Debug;
import weka.core.Debug.Random;

/**
 *
 * @author Le Ba Quoc Truong
 */
public class MyDecisionTreeModel extends MyKnowledgeModel{
    J48 tree;

    public MyDecisionTreeModel(String filename, String m_opts, String d_opts) throws Exception {
        super(filename, m_opts, d_opts);
    }
    
    public void buildDecisionTree() throws Exception{
        // Tao tap du lieu train& test
        this.trainset = divideTrainTestR(this.dataset, 80, false);
        this.testset = divideTrainTestR(this.dataset, 80, true);
        this.trainset.setClassIndex(this.trainset.numAttributes() -1);
        this.testset.setClassIndex(this.trainset.numAttributes() -1);
        // Thiet lap thong so cho mo hinh cay quyet dinh
        tree = new J48();
        tree.setOptions(this.model_options);
        // Huan luyen mo hinh voi tap du lieu train
        tree.buildClassifier(this.trainset);
    }
    
    public void evalueteDescisionTree() throws Exception {
        Random rnd = new Debug.Random(1);
        int folds = 10;
        Evaluation eval = new Evaluation(this.trainset);
//        eval.evaluateModel(tree, this.trainset);
        eval.crossValidateModel(tree, this.testset, folds, rnd);
        System.out.println(eval.toSummaryString(
                "\nKet qua danh gia mo hinh 10-folds cross-validation\n-----\n", false));
    }

    @Override
    public String toString() {
        return tree.toSummaryString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
