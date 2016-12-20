/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicwarfare;

/**
 *
 * @author yigitpolat
 */
public class Weapon extends GameObject implements Pressable
{
    @Override
    public void onPress()
    {
        System.out.println("weapon press");
    }
}
