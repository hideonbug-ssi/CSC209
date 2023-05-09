/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarysearchtreelab;

/**
 *
 * @author User
 */
public class BinarySearchTreeLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BSTtree tree1 = new BSTtree();
        tree1.insert(59);
        tree1.insert(100);
        tree1.insert(20);
        tree1.insert(200);
        //              59
        //      20              100
        //                          200
        System.out.println(tree1.root.info);
        System.out.println(tree1.root.right.info);
        System.out.println(tree1.root.right.right.info);
        System.out.println(tree1.root.left.info);
        
        BSTnode s = tree1.search(1000);
        if(s != null){
            System.out.println(s.info);
        }else{
            System.out.println("not found");
        }
        tree1.insert(31);
        tree1.insert(43);
        tree1.insert(150);
        tree1.insert(1911);
        //              59
        //      20              100
        //         31                 200
        //           43            150   1911
        //preOrder: 59,20,31,43,100,200,150,1911
        tree1.preorderTraversalInterative();
        System.out.println("");
        tree1.preorderTraversalRecursion(tree1.root);
        System.out.println("");
        tree1.inorderTraversalRecursion(tree1.root);
        System.out.println("");
        tree1.postorderTraversalRecursion(tree1.root);
        //case1 delete root
        //tree1.deleteByMerging(59);//delete root
        //System.out.println("\n" + tree1.root.info);
        // 20
        //   31
        //     43
        //       100
        //          200
        //         150 1911
        //case 2
        //tree1.deletByMerging(31);
        //System.out.println("\n" + tree1.root.left.right.info);
        //case 3 delete 200
        //tree1.deleteByMerging(200);
        //System.out.println("\n" + tree1.root.right.right.info);
        //System.out.println(tree1.root.right.right.right.info);
        //          59
        //      20      100
        //        31       200
        //          43        1911
        tree1.deleteByMerging(150);
        System.out.println("\n" + tree1.root.right.right.left);
    }
}
