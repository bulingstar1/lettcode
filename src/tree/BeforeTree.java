package tree;

import java.util.ArrayList;
import java.util.List;

public class BeforeTree {
    public static List<Integer> beforeTravel(TreeNode root){
        ArrayList<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        //单层操作
       //先添加根节点
        res.add(root.val);
        res.addAll(beforeTravel(root.left));
        res.addAll(beforeTravel(root.right));

        return res;
    }
}
