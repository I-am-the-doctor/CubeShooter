/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kgr.cubeshooter.world.entities;

import kgr.cubeshooter.world.Physics;
import kgr.engine.Input;

/**
 *
 * @author Benjamin
 */
public interface ITickable {
	
	public void tick(Physics physics, Input input, float milliseconds);
}
