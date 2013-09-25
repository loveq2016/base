package com.base.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ValidateCode extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9217203885907842658L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String type = request.getParameter("type");
		String content = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		//以那种方式显示  验证码
		if("number".equals(type)) {
			content = "0123456789";
		} else if ("letter".equals(type)) {
			content = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		}
		Integer length = content.length();
		char[] str = content.toCharArray();
		// 在内存中创建图象   
		int width = 60, height = 20;

		try {
			//设置页面不缓存  
			response.setHeader("Pragma", "No-cache");
			response.setHeader("Cache-Control", "no-cache");
			response.setDateHeader("Expires", 0);
			
			BufferedImage image = new BufferedImage(width, height,
					BufferedImage.TYPE_INT_RGB);
			//返回客户端的输出流
			OutputStream os = response.getOutputStream();
			// 获取图形上下文   
			Graphics g = image.getGraphics();
			//生成随机类对象   
			Random random = new Random();
			// 设定背景色  
			g.setColor(getRandColor(200, 250));
			g.fillRect(0, 0, width, height);
			//设定字体
			g.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			//随机生成155条干扰线
			g.setColor(getRandColor(160, 200));
			for (int i = 0; i < 155; i++) {
				int x = random.nextInt(width);
				int y = random.nextInt(height);
				int xl = random.nextInt(12);
				int yl = random.nextInt(12);
				g.drawLine(x, y, x + xl, y + yl);
			}
			//随机生成 Aa-Zz 0-9的4位验证码！ 
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < 4; i++) {

				String rand = String.valueOf(str[random.nextInt(length)]);
				sb.append(rand);
				// 将认证码显示到图象中  
				g.setColor(new Color(20 + random.nextInt(110), 20 + random
						.nextInt(110), 20 + random.nextInt(110)));
				g.drawString(rand, 13 * i + 6, 16);
			}

			// 将认证码存入SESSION 
			request.getSession().setAttribute(Config.VERIFYCODE, sb.toString());
			// 图象生效 
			g.dispose();

			//输出图像到页面！
			ImageIO.write(image, "JPEG", os);
			os.flush();
			os.close();
			response.flushBuffer();
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private Color getRandColor(int fc, int bc) {
		//给定范围获得随机颜色  
		Random random = new Random();
		if (fc > 255)
			fc = 255;
		if (bc > 255)
			bc = 255;
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		return new Color(r, g, b);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

	
}
