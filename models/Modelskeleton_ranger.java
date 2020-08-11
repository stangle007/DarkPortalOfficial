// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelskeleton_ranger extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer headwear;
	private final ModelRenderer body;
	private final ModelRenderer bone6;
	private final ModelRenderer body_sub_1;
	private final ModelRenderer bone7;
	private final ModelRenderer body_sub_3;
	private final ModelRenderer bone8;
	private final ModelRenderer body_sub_5;
	private final ModelRenderer bone9;
	private final ModelRenderer body_sub_7;
	private final ModelRenderer bone10;
	private final ModelRenderer bone3;
	private final ModelRenderer body_sub_10;
	private final ModelRenderer bone4;
	private final ModelRenderer body_sub_12;
	private final ModelRenderer bone5;
	private final ModelRenderer body_sub_14;
	private final ModelRenderer Rib3;
	private final ModelRenderer body_sub_16;
	private final ModelRenderer bone11;
	private final ModelRenderer body_sub_18;
	private final ModelRenderer bone16;
	private final ModelRenderer body_sub_20;
	private final ModelRenderer bone17;
	private final ModelRenderer body_sub_22;
	private final ModelRenderer bone18;
	private final ModelRenderer Rib4;
	private final ModelRenderer body_sub_25;
	private final ModelRenderer bone19;
	private final ModelRenderer body_sub_27;
	private final ModelRenderer bone20;
	private final ModelRenderer body_sub_29;
	private final ModelRenderer bone21;
	private final ModelRenderer body_sub_31;
	private final ModelRenderer bone22;
	private final ModelRenderer Rib2;
	private final ModelRenderer body_sub_34;
	private final ModelRenderer bone12;
	private final ModelRenderer body_sub_36;
	private final ModelRenderer bone13;
	private final ModelRenderer body_sub_38;
	private final ModelRenderer bone14;
	private final ModelRenderer body_sub_40;
	private final ModelRenderer bone15;
	private final ModelRenderer Rib5;
	private final ModelRenderer body_sub_43;
	private final ModelRenderer bone23;
	private final ModelRenderer body_sub_45;
	private final ModelRenderer bone24;
	private final ModelRenderer body_sub_47;
	private final ModelRenderer bone25;
	private final ModelRenderer body_sub_49;
	private final ModelRenderer bone26;
	private final ModelRenderer Rib6;
	private final ModelRenderer body_sub_52;
	private final ModelRenderer bone27;
	private final ModelRenderer body_sub_54;
	private final ModelRenderer bone28;
	private final ModelRenderer body_sub_56;
	private final ModelRenderer bone29;
	private final ModelRenderer body_sub_58;
	private final ModelRenderer bone30;
	private final ModelRenderer body_sub_2;
	private final ModelRenderer left_arm;
	private final ModelRenderer bone;
	private final ModelRenderer left_arm_sub_1;
	private final ModelRenderer right_arm;
	private final ModelRenderer bone2;
	private final ModelRenderer right_arm_sub_1;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public Modelskeleton_ranger() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, true);

		headwear = new ModelRenderer(this);
		headwear.setRotationPoint(0.0F, 0.0F, 0.0F);
		headwear.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.25F, true);
		headwear.setTextureOffset(44, 11).addBox(-4.5F, -1.8F, -4.75F, 9.0F, 2.0F, 0.0F, 0.0F, true);
		headwear.setTextureOffset(49, 10).addBox(4.5F, -2.75F, -4.75F, 0.0F, 3.0F, 1.0F, 0.0F, true);
		headwear.setTextureOffset(45, 9).addBox(-4.5F, -2.75F, -4.75F, 0.0F, 3.0F, 1.0F, 0.0F, true);
		headwear.setTextureOffset(45, 10).addBox(4.5F, -1.75F, -3.75F, 0.0F, 2.0F, 1.0F, 0.0F, true);
		headwear.setTextureOffset(49, 9).addBox(-4.5F, -1.75F, -3.75F, 0.0F, 2.0F, 1.0F, 0.0F, true);
		headwear.setTextureOffset(45, 5).addBox(4.5F, -0.75F, -2.75F, 0.0F, 1.0F, 7.0F, 0.0F, true);
		headwear.setTextureOffset(43, 5).addBox(-4.5F, -0.75F, -2.75F, 0.0F, 1.0F, 7.0F, 0.0F, true);
		headwear.setTextureOffset(42, 12).addBox(-4.5F, -0.75F, 4.25F, 9.0F, 1.0F, 0.0F, 0.0F, true);
		headwear.setTextureOffset(48, 10).addBox(1.5F, -2.8F, -4.75F, 3.0F, 1.0F, 0.0F, 0.0F, true);
		headwear.setTextureOffset(47, 11).addBox(-1.0F, -2.8F, -4.75F, 2.0F, 1.0F, 0.0F, 0.0F, true);
		headwear.setTextureOffset(54, 12).addBox(-4.5F, -2.8F, -4.75F, 3.0F, 1.0F, 0.0F, 0.0F, true);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-2.2F, 20.6708F, 7.6189F);
		body.addChild(bone6);
		setRotationAngle(bone6, 0.0873F, 0.6109F, 0.0F);

		body_sub_1 = new ModelRenderer(this);
		body_sub_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(body_sub_1);
		body_sub_1.setTextureOffset(24, 10).addBox(6.697F, -17.5049F, -2.8588F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.6109F, 0.0F);

		body_sub_3 = new ModelRenderer(this);
		body_sub_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(body_sub_3);
		body_sub_3.setTextureOffset(24, 10).addBox(8.3417F, -17.5049F, 2.3941F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.6109F, 0.0F);

		body_sub_5 = new ModelRenderer(this);
		body_sub_5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(body_sub_5);
		body_sub_5.setTextureOffset(24, 10).addBox(6.6501F, -17.5049F, 7.737F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.6109F, 0.0F);

		body_sub_7 = new ModelRenderer(this);
		body_sub_7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone9.addChild(body_sub_7);
		body_sub_7.setTextureOffset(24, 10).addBox(2.1233F, -17.5049F, 11.2076F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-5.573F, 0.0F, 4.6763F);
		bone9.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.6109F, 0.0F);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-2.0F, 17.0F, 5.0F);
		body.addChild(bone3);
		setRotationAngle(bone3, 0.1745F, 0.0F, 0.0F);

		body_sub_10 = new ModelRenderer(this);
		body_sub_10.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(body_sub_10);
		body_sub_10.setTextureOffset(16, 16).addBox(0.0F, -17.8189F, -2.4127F, 4.0F, 6.0F, 2.0F, 0.0F, true);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-2.0F, 21.1958F, 2.8939F);
		body.addChild(bone4);

		body_sub_12 = new ModelRenderer(this);
		body_sub_12.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(body_sub_12);
		body_sub_12.setTextureOffset(16, 16).addBox(0.0F, -15.725F, -2.3F, 4.0F, 4.0F, 2.0F, 0.0F, true);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-2.0F, 24.6708F, -1.3811F);
		body.addChild(bone5);
		setRotationAngle(bone5, -0.2618F, 0.0F, 0.0F);

		body_sub_14 = new ModelRenderer(this);
		body_sub_14.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(body_sub_14);
		body_sub_14.setTextureOffset(16, 16).addBox(-0.5F, -15.7412F, -2.9659F, 5.0F, 4.0F, 3.0F, 0.0F, true);

		Rib3 = new ModelRenderer(this);
		Rib3.setRotationPoint(-8.2F, 23.4708F, 4.6189F);
		body.addChild(Rib3);
		setRotationAngle(Rib3, 0.0873F, 0.6109F, 0.0F);

		body_sub_16 = new ModelRenderer(this);
		body_sub_16.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rib3.addChild(body_sub_16);
		body_sub_16.setTextureOffset(24, 10).addBox(9.1999F, -14.6118F, 3.3352F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rib3.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.6109F, 0.0F);

		body_sub_18 = new ModelRenderer(this);
		body_sub_18.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(body_sub_18);
		body_sub_18.setTextureOffset(24, 10).addBox(6.8392F, -14.6118F, 8.9035F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(bone16);
		setRotationAngle(bone16, 0.0F, 0.6109F, 0.0F);

		body_sub_20 = new ModelRenderer(this);
		body_sub_20.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone16.addChild(body_sub_20);
		body_sub_20.setTextureOffset(24, 10).addBox(1.6857F, -14.6118F, 12.2074F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone16.addChild(bone17);
		setRotationAngle(bone17, 0.0F, 0.6109F, 0.0F);

		body_sub_22 = new ModelRenderer(this);
		body_sub_22.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone17.addChild(body_sub_22);
		body_sub_22.setTextureOffset(24, 10).addBox(-4.5074F, -14.6118F, 12.0221F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-5.573F, 0.0F, 4.6763F);
		bone17.addChild(bone18);
		setRotationAngle(bone18, 0.0F, 0.6109F, 0.0F);

		Rib4 = new ModelRenderer(this);
		Rib4.setRotationPoint(-14.2F, 20.7708F, 4.6189F);
		body.addChild(Rib4);
		setRotationAngle(Rib4, 0.0873F, -0.6109F, 0.0F);

		body_sub_25 = new ModelRenderer(this);
		body_sub_25.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rib4.addChild(body_sub_25);
		body_sub_25.setTextureOffset(24, 10).addBox(6.7813F, -18.4839F, -9.944F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rib4.addChild(bone19);
		setRotationAngle(bone19, 0.0F, -0.6109F, 0.0F);

		body_sub_27 = new ModelRenderer(this);
		body_sub_27.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone19.addChild(body_sub_27);
		body_sub_27.setTextureOffset(24, 10).addBox(-1.8272F, -18.4731F, -12.2947F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone19.addChild(bone20);
		setRotationAngle(bone20, 0.0F, -0.6109F, 0.0F);

		body_sub_29 = new ModelRenderer(this);
		body_sub_29.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone20.addChild(body_sub_29);
		body_sub_29.setTextureOffset(24, 10).addBox(-10.0918F, -18.4486F, -9.0158F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone20.addChild(bone21);
		setRotationAngle(bone21, 0.0F, -0.6109F, 0.0F);

		body_sub_31 = new ModelRenderer(this);
		body_sub_31.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone21.addChild(body_sub_31);
		body_sub_31.setTextureOffset(24, 10).addBox(-14.7326F, -18.5023F, -1.7248F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-5.573F, 0.0F, 4.6763F);
		bone21.addChild(bone22);
		setRotationAngle(bone22, 0.0F, -0.6109F, 0.0F);

		Rib2 = new ModelRenderer(this);
		Rib2.setRotationPoint(-8.2F, 20.7708F, 4.6189F);
		body.addChild(Rib2);
		setRotationAngle(Rib2, 0.0873F, 0.6109F, 0.0F);

		body_sub_34 = new ModelRenderer(this);
		body_sub_34.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rib2.addChild(body_sub_34);
		body_sub_34.setTextureOffset(24, 10).addBox(9.1999F, -14.6118F, 3.3352F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rib2.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.6109F, 0.0F);

		body_sub_36 = new ModelRenderer(this);
		body_sub_36.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone12.addChild(body_sub_36);
		body_sub_36.setTextureOffset(24, 10).addBox(6.8392F, -14.6118F, 8.9035F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone12.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.6109F, 0.0F);

		body_sub_38 = new ModelRenderer(this);
		body_sub_38.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(body_sub_38);
		body_sub_38.setTextureOffset(24, 10).addBox(1.6857F, -14.6118F, 12.2074F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.6109F, 0.0F);

		body_sub_40 = new ModelRenderer(this);
		body_sub_40.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone14.addChild(body_sub_40);
		body_sub_40.setTextureOffset(24, 10).addBox(-4.5074F, -14.6118F, 12.0221F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-5.573F, 0.0F, 4.6763F);
		bone14.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.6109F, 0.0F);

		Rib5 = new ModelRenderer(this);
		Rib5.setRotationPoint(-14.2F, 23.3708F, 4.6189F);
		body.addChild(Rib5);
		setRotationAngle(Rib5, 0.0873F, -0.6109F, 0.0F);

		body_sub_43 = new ModelRenderer(this);
		body_sub_43.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rib5.addChild(body_sub_43);
		body_sub_43.setTextureOffset(24, 10).addBox(6.7813F, -18.4839F, -9.944F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rib5.addChild(bone23);
		setRotationAngle(bone23, 0.0F, -0.6109F, 0.0F);

		body_sub_45 = new ModelRenderer(this);
		body_sub_45.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone23.addChild(body_sub_45);
		body_sub_45.setTextureOffset(24, 10).addBox(-1.8272F, -18.4731F, -12.2947F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone23.addChild(bone24);
		setRotationAngle(bone24, 0.0F, -0.6109F, 0.0F);

		body_sub_47 = new ModelRenderer(this);
		body_sub_47.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone24.addChild(body_sub_47);
		body_sub_47.setTextureOffset(24, 10).addBox(-10.0918F, -18.4486F, -9.0158F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone24.addChild(bone25);
		setRotationAngle(bone25, 0.0F, -0.6109F, 0.0F);

		body_sub_49 = new ModelRenderer(this);
		body_sub_49.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone25.addChild(body_sub_49);
		body_sub_49.setTextureOffset(24, 10).addBox(-14.7326F, -18.5023F, -1.7248F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(-5.573F, 0.0F, 4.6763F);
		bone25.addChild(bone26);
		setRotationAngle(bone26, 0.0F, -0.6109F, 0.0F);

		Rib6 = new ModelRenderer(this);
		Rib6.setRotationPoint(-14.2F, 26.0708F, 4.6189F);
		body.addChild(Rib6);
		setRotationAngle(Rib6, 0.0873F, -0.6109F, 0.0F);

		body_sub_52 = new ModelRenderer(this);
		body_sub_52.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rib6.addChild(body_sub_52);
		body_sub_52.setTextureOffset(24, 10).addBox(6.7813F, -18.4839F, -9.944F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(0.0F, 0.0F, 0.0F);
		Rib6.addChild(bone27);
		setRotationAngle(bone27, 0.0F, -0.6109F, 0.0F);

		body_sub_54 = new ModelRenderer(this);
		body_sub_54.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone27.addChild(body_sub_54);
		body_sub_54.setTextureOffset(24, 10).addBox(-1.8272F, -18.4731F, -12.2947F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone27.addChild(bone28);
		setRotationAngle(bone28, 0.0F, -0.6109F, 0.0F);

		body_sub_56 = new ModelRenderer(this);
		body_sub_56.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone28.addChild(body_sub_56);
		body_sub_56.setTextureOffset(24, 10).addBox(-10.0918F, -18.4486F, -9.0158F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone28.addChild(bone29);
		setRotationAngle(bone29, 0.0F, -0.6109F, 0.0F);

		body_sub_58 = new ModelRenderer(this);
		body_sub_58.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone29.addChild(body_sub_58);
		body_sub_58.setTextureOffset(24, 10).addBox(-14.7326F, -18.5023F, -1.7248F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-5.573F, 0.0F, 4.6763F);
		bone29.addChild(bone30);
		setRotationAngle(bone30, 0.0F, -0.6109F, 0.0F);

		body_sub_2 = new ModelRenderer(this);
		body_sub_2.setRotationPoint(-2.0F, 17.0F, 5.0F);
		body.addChild(body_sub_2);
		body_sub_2.setTextureOffset(43, 0).addBox(-6.0F, -16.8189F, -6.9127F, 6.0F, 2.0F, 4.0F, 0.0F, true);
		body_sub_2.setTextureOffset(48, 0).addBox(4.0F, -16.8189F, -5.9127F, 6.0F, 2.0F, 4.0F, 0.0F, true);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(0.475F, 5.25F, 0.0F);
		setRotationAngle(left_arm, 0.0F, 0.0F, -0.4363F);
		left_arm.setTextureOffset(40, 16).addBox(2.608F, -2.0463F, 0.0F, 2.0F, 8.0F, 2.0F, 0.0F, true);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(20.9019F, 50.019F, 1.0F);
		left_arm.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, 0.1745F);

		left_arm_sub_1 = new ModelRenderer(this);
		left_arm_sub_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(left_arm_sub_1);
		left_arm_sub_1.setTextureOffset(40, 16).addBox(-25.6666F, -40.5463F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, true);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(6.175F, 4.8F, 1.0F);
		setRotationAngle(right_arm, 0.0F, 0.0F, 0.4363F);
		right_arm.setTextureOffset(40, 16).addBox(-10.4857F, 0.772F, -0.4F, 2.0F, 8.0F, 2.0F, 0.0F, true);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-5.3963F, 15.4604F, 0.0F);
		right_arm.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.1745F);

		right_arm_sub_1 = new ModelRenderer(this);
		right_arm_sub_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(right_arm_sub_1);
		right_arm_sub_1.setTextureOffset(40, 16).addBox(-3.8443F, -7.5457F, -0.4F, 2.0F, 6.0F, 2.0F, 0.0F, true);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(0.0F, 12.025F, 0.0F);
		left_leg.setTextureOffset(0, 16).addBox(0.5F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(1.9F, 12.0F, 0.0F);
		right_leg.setTextureOffset(0, 16).addBox(-4.425F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		headwear.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.headwear.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.headwear.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_arm.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
	}
}