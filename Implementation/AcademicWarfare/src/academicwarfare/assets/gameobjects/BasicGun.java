/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicwarfare.assets.gameobjects;

import academicwarfare.assets.GameScene;

/**
 *
 * @author yigitpolat
 */
public class BasicGun extends Weapon
{
    public BasicGun( GameScene s)
    {
        super(s, 100, 2);
        setDamage( 10);
    }
}
