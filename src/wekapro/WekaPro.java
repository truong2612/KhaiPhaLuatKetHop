/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wekapro;

/**
 *
 * @author Le Ba Quoc Truong
 */
public class WekaPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
//        MyKnowledgeModel model = new MyKnowledgeModel(
//                "C:\\Program Files\\Weka-3-8-6\\data\\iris.arff");
//        System.out.println(model);
//        model.saveData("D:\\Data\\iris.arff");
//        model.saveData2CSV("D:\\Data\\iris_CSV.csv");

//            MyAprioriModel model = new MyAprioriModel(
//            "C:\\Program Files\\Weka-3-8-6\\data\\weather.numeric.arff", 
//            "-N 10 -T 0 -C 0.9 -D 0.05 -U 1.0 -M 0.1 -S -1.0 -c -1", 
//            "-R 2-3");
//            model.mineAssociationRules();

//            MyFPGrowthModel model = new MyFPGrowthModel(
//                    "C:\\Program Files\\Weka-3-8-6\\data\\weather.nominal.arff",
//                    "-P 2 -I -1 -N 10 -T 0 -C 0.7 -D 0.05 -U 1.0 -M 0.2",
//                    "-N-R first-last");
//            model.mineAssociationRules();
//            System.out.println(model);
//             MyKnowledgeModel model = new MyKnowledgeModel(
//                     "C:\\Program Files\\Weka-3-8-6\\data\\iris.arff", null, null);
//             model.trainset = model.divideTrainTestR(model.dataset, 80, false);
//             model.testset = model.divideTrainTestR(model.dataset, 80, true);
//             System.out.println(model);
//             System.out.println(model.trainset.toSummaryString());
//             System.out.println(model.testset.toSummaryString());
             
             MyDecisionTreeModel model = new MyDecisionTreeModel(
                     "C:\\Program Files\\Weka-3-8-6\\data\\iris.arff"
                  , "-C 0.25 -M 2", null);
          model.buildDecisionTree();
          model.evalueteDescisionTree();
          System.out.println(model);
        }
    
    }
        

    

