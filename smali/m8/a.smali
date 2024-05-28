.class public final synthetic Lm8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/n0$a;


# instance fields
.field public final synthetic a:Lcom/roblox/client/qrscanner/CustomCaptureActivity;

.field public final synthetic b:Li6/b;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/qrscanner/CustomCaptureActivity;Li6/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm8/a;->a:Lcom/roblox/client/qrscanner/CustomCaptureActivity;

    iput-object p2, p0, Lm8/a;->b:Li6/b;

    return-void
.end method


# virtual methods
.method public synthetic a()Landroid/util/Size;
    .locals 1

    invoke-static {p0}, Landroidx/camera/core/m0;->a(Landroidx/camera/core/n0$a;)Landroid/util/Size;

    move-result-object v0

    return-object v0
.end method

.method public final b(Landroidx/camera/core/l1;)V
    .locals 2

    iget-object v0, p0, Lm8/a;->a:Lcom/roblox/client/qrscanner/CustomCaptureActivity;

    iget-object v1, p0, Lm8/a;->b:Li6/b;

    invoke-static {v0, v1, p1}, Lcom/roblox/client/qrscanner/CustomCaptureActivity;->A1(Lcom/roblox/client/qrscanner/CustomCaptureActivity;Li6/b;Landroidx/camera/core/l1;)V

    return-void
.end method
