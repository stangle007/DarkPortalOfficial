// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelzombie_brute extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer headwear;
	private final ModelRenderer body;
	private final ModelRenderer bone;
	private final ModelRenderer body_sub_1;
	private final ModelRenderer left_leg;
	private final ModelRenderer bone2;
	private final ModelRenderer left_leg_sub_1;
	private final ModelRenderer right_leg;
	private final ModelRenderer bone1;
	private final ModelRenderer right_leg_sub_1;
	private final ModelRenderer left_arm;
	private final ModelRenderer bone3;
	private final ModelRenderer left_arm_sub_1;
	private final ModelRenderer bone6;
	private final ModelRenderer left_arm_sub_3;
	private final ModelRenderer right_arm;
	private final ModelRenderer bone4;
	private final ModelRenderer right_arm_sub_1;
	private final ModelRenderer bone5;
	private final ModelRenderer right_arm_sub_3;

	public Modelzombie_brute() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 1.0F, -3.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -7.0F, -6.0F, 8.0F, 8.0F, 8.0F, 0.0F, true);

		headwear = new ModelRenderer(this);
		headwear.setRotationPoint(0.0F, 1.0F, -3.0F);
		headwear.setTextureOffset(32, 0).addBox(-4.0F, -7.0F, -6.0F, 8.0F, 8.0F, 8.0F, 0.25F, true);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(36, 52).addBox(-5.0F, 7.3F, 0.0F, 10.0F, 7.0F, 4.0F, 0.0F, true);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 19.3F, 8.0F);
		body.addChild(bone);
		setRotationAngle(bone, 0.4363F, 0.0F, 0.0F);

		body_sub_1 = new ModelRenderer(this);
		body_sub_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(body_sub_1);
		body_sub_1.setTextureOffset(0, 32).addBox(-8.0F, -21.5123F, -6.1746F, 16.0F, 9.0F, 11.0F, 0.0F, true);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		left_leg.setTextureOffset(0, 21).addBox(2.9F, 4.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(3.9F, 3.0F, 1.0F);
		left_leg.addChild(bone2);
		setRotationAngle(bone2, -0.5236F, 0.0F, 0.0F);

		left_leg_sub_1 = new ModelRenderer(this);
		left_leg_sub_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(left_leg_sub_1);
		left_leg_sub_1.setTextureOffset(0, 16).addBox(-1.0F, -2.0302F, -2.1285F, 4.0F, 5.0F, 4.0F, 0.0F, true);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(1.9F, 12.0F, 0.0F);
		right_leg.setTextureOffset(0, 21).addBox(-6.9F, 4.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

		bone1 = new ModelRenderer(this);
		bone1.setRotationPoint(-3.9F, 3.2F, 1.0F);
		right_leg.addChild(bone1);
		setRotationAngle(bone1, -0.5236F, 0.0F, 0.0F);

		right_leg_sub_1 = new ModelRenderer(this);
		right_leg_sub_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone1.addChild(right_leg_sub_1);
		right_leg_sub_1.setTextureOffset(0, 16).addBox(-3.0F, -2.2302F, -2.1285F, 4.0F, 5.0F, 4.0F, 0.0F, true);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(11.0F, 5.0F, -2.0F);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-1.0F, 0.0F, -1.0F);
		left_arm.addChild(bone3);

		left_arm_sub_1 = new ModelRenderer(this);
		left_arm_sub_1.setRotationPoint(0.0F, -1.4831F, 0.4389F);
		bone3.addChild(left_arm_sub_1);
		left_arm_sub_1.setTextureOffset(40, 16).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.0F, true);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-2.0F, 3.0057F, -25.7808F);
		left_arm.addChild(bone6);
		setRotationAngle(bone6, -0.3491F, 0.0F, 0.0F);

		left_arm_sub_3 = new ModelRenderer(this);
		left_arm_sub_3.setRotationPoint(12.0F, 0.0F, 0.0F);
		bone6.addChild(left_arm_sub_3);
		left_arm_sub_3.setTextureOffset(5, 54).addBox(-13.0F, -5.0372F, 23.0262F, 4.0F, 6.0F, 4.0F, 0.0F, true);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-9.0F, 4.0F, -1.0F);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(9.0F, -128.2F, -61.275F);
		right_arm.addChild(bone4);

		right_arm_sub_1 = new ModelRenderer(this);
		right_arm_sub_1.setRotationPoint(-10.0F, 131.5463F, 60.5861F);
		bone4.addChild(right_arm_sub_1);
		right_arm_sub_1.setTextureOffset(40, 16).addBox(-2.0F, -5.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.0F, true);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-7.0F, 134.1479F, 40.5704F);
		bone4.addChild(bone5);
		setRotationAngle(bone5, -0.3491F, 0.0F, 0.0F);

		right_arm_sub_3 = new ModelRenderer(this);
		right_arm_sub_3.setRotationPoint(-3.0F, -1.8202F, 18.5854F);
		bone5.addChild(right_arm_sub_3);
		right_arm_sub_3.setTextureOffset(5, 54).addBox(-2.0F, -3.5125F, -1.1123F, 4.0F, 6.0F, 4.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		headwear.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.headwear.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.headwear.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}