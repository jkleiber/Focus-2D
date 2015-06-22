package com.justinkleiber.focus2d.controllers;

import com.justinkleiber.focus2d.base.*;

public class FocusCollision implements Collision{

	@Override
	public boolean isCollisionExist(Sprite s, Sprite t) {
		// TODO Auto-generated method stub
			//Sprite S data and position
			int s_h = s.getHeight();
			int s_w = s.getWidth();
			int s_x = s.getPosition().x;
			int s_y = s.getPosition().y;
			
			//Sprite T data and position
			int t_h = t.getHeight();
			int t_w = t.getWidth();
			int t_x = t.getPosition().x;
			int t_y = t.getPosition().y;
			if (s_y+s_h<t_y)
			{
				return false;
            }
            if (s_y>t_y+t_h)
            {
            	return false;
            }
            if (s_x+s_w<t_x)
            {
            	return false;
            }
            if (s_x>t_w+t_x)
            {
            	return false;
            }
            return true;
	}

	@Override
	public boolean isCollisionExist(SpriteSheet ss, SpriteSheet tt) {
		// TODO Auto-generated method stub
		//SpriteSheet S data and position
		int s_h = ss.getSpriteHeight();
		int s_w = ss.getSpriteWidth();
		int s_x = ss.getPosition().x;
		int s_y = ss.getPosition().y;
		
		//SpriteSheet T data and position
		int t_h = tt.getSpriteHeight();
		int t_w = tt.getSpriteWidth();
		int t_x = tt.getPosition().x;
		int t_y = tt.getPosition().y;
		if (s_y+s_h<t_y)
		{
			return false;
        }
        if (s_y>t_y+t_h)
        {
        	return false;
        }
        if (s_x+s_w<t_x)
        {
        	return false;
        }
        if (s_x>t_w+t_x)
        {
        	return false;
        }
        return true;
	}

	@Override
	public boolean isCollisionExist(Sprite s, SpriteSheet ss) {
		// TODO Auto-generated method stub
		//Sprite S data and position
		int s_h = s.getHeight();
		int s_w = s.getWidth();
		int s_x = s.getPosition().x;
		int s_y = s.getPosition().y;
		
		//Sprite T data and position
		int t_h = ss.getSpriteHeight();
		int t_w = ss.getSpriteWidth();
		int t_x = ss.getPosition().x;
		int t_y = ss.getPosition().y;
		if (s_y+s_h<t_y)
		{
			return false;
        }
        if (s_y>t_y+t_h)
        {
        	return false;
        }
        if (s_x+s_w<t_x)
        {
        	return false;
        }
        if (s_x>t_w+t_x)
        {
        	return false;
        }
        return true;
	}


	public boolean collide(double cx, double cy, double cw, double ch, double ex, double ey, double ew, double eh){
		if (cy+ch<ey){
            return false;
            }
            if (cy>ey+eh){
            return false;
            }
            if (cx+cw<ex){
            return false;
            }
            if (cx>ew+ex){
            return false;
            }
            return true;
	}

	@Override
	public boolean isInPosition(Sprite s, Position p) {
		// TODO Auto-generated method stub
		int s_x = s.getPosition().x;
		int s_y = s.getPosition().y;
		
		int p_x = p.x;
		int p_y = p.y;
		
		if(s_x== p_x && s_y == p_y)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean isInPosition(Sprite s, Position p, int tolerance) {
		// TODO Auto-generated method stub
		int s_x = s.getPosition().x;
		int s_y = s.getPosition().y;
		
		int p_x = p.x;
		int p_y = p.y;
		
		//if between the position tolerance, return true
		if((s_x >= p_x-tolerance && s_x <= p_x+tolerance)&&(s_y >= p_y-tolerance && s_y <= p_y+tolerance))
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean isInPosition(SpriteSheet ss, Position p) {
		// TODO Auto-generated method stub
		int s_x = ss.getPosition().x;
		int s_y = ss.getPosition().y;
		
		int p_x = p.x;
		int p_y = p.y;
		
		if(s_x== p_x && s_y == p_y)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean isInPosition(SpriteSheet ss, Position p, int tolerance) {
		// TODO Auto-generated method stub
		int s_x = ss.getPosition().x;
		int s_y = ss.getPosition().y;
		
		int p_x = p.x;
		int p_y = p.y;
		
		//if between the position tolerance, return true
		if((s_x >= p_x-tolerance && s_x <= p_x+tolerance)&&(s_y >= p_y-tolerance && s_y <= p_y+tolerance))
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean isCollisionExist(int sx, int sy, int sw, int sh, int tx,
			int ty, int tw, int th, boolean onCenter) {
		// TODO Auto-generated method stub
		if(!onCenter)
		{
			if (sy+sh<ty)
			{
				return false;
            }
            if (sy>ty+th)
            {
            	return false;
            }
            if (sx+sw<tx)
            {
            	return false;
            }
            if (sx>tw+tx)
            {
            	return false;
            }
            return true;
		}
		else
		{
			if (sy+(sh/2)<ty-(th/2))
			{
				return false;
            }
            if (sy-(sh/2)>ty+(th/2))
            {
            	return false;
            }
            if (sx+(sw/2)<tx-(tw/2))
            {
            	return false;
            }
            if (sx-(sw/2)>(tw/2)+tx)
            {
            	return false;
            }
            return true;
		}
	}

	protected boolean isInsideAngledQuad(double m, double b, int x, int y, int w, int h)
	{
		double one = m*x +b;
		double two = m*x -b;

		double three = (-1/m)*x + b;
		double four = (-1/m)*x - b;

		//if between all values or equal, return true

		if((y<=one && y>=two)&&(x>=three && x<=four))
		{
			return true;
		}

		return false;
	}
	@Override
	public boolean isCollisionExist(int sx, int sy, int sw, int sh, int tx, int ty, int tw, int th, float s_angle) {
		double m_lh, m_ang, l_b;

		m_lh = Math.atan(s_angle*180/Math.PI);

		m_ang=Math.sin(s_angle*180/Math.PI);

		l_b=(sw/2)/m_ang;

		return isInsideAngledQuad(m_lh,l_b,tx,ty,tw,th);
	}


}
