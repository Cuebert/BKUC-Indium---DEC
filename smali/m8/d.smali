.class public final synthetic Lm8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/h;


# instance fields
.field public final synthetic a:Lcom/roblox/client/qrscanner/CustomCaptureActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/qrscanner/CustomCaptureActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm8/d;->a:Lcom/roblox/client/qrscanner/CustomCaptureActivity;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lm8/d;->a:Lcom/roblox/client/qrscanner/CustomCaptureActivity;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lcom/roblox/client/qrscanner/CustomCaptureActivity;->D1(Lcom/roblox/client/qrscanner/CustomCaptureActivity;Ljava/util/List;)V

    return-void
.end method
