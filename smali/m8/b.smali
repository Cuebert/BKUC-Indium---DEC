.class public final synthetic Lm8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/f;


# instance fields
.field public final synthetic a:Landroidx/camera/core/l1;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/l1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm8/b;->a:Landroidx/camera/core/l1;

    return-void
.end method


# virtual methods
.method public final a(Lg4/l;)V
    .locals 1

    iget-object v0, p0, Lm8/b;->a:Landroidx/camera/core/l1;

    invoke-static {v0, p1}, Lcom/roblox/client/qrscanner/CustomCaptureActivity;->C1(Landroidx/camera/core/l1;Lg4/l;)V

    return-void
.end method
