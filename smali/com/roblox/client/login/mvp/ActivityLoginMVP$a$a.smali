.class Lcom/roblox/client/login/mvp/ActivityLoginMVP$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/t0$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/login/mvp/ActivityLoginMVP$a;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/client/login/mvp/ActivityLoginMVP$a;


# direct methods
.method constructor <init>(Lcom/roblox/client/login/mvp/ActivityLoginMVP$a;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/login/mvp/ActivityLoginMVP$a$a;->a:Lcom/roblox/client/login/mvp/ActivityLoginMVP$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/login/mvp/ActivityLoginMVP$a$a;->a:Lcom/roblox/client/login/mvp/ActivityLoginMVP$a;

    iget-object v0, v0, Lcom/roblox/client/login/mvp/ActivityLoginMVP$a;->n:Lcom/roblox/client/login/mvp/ActivityLoginMVP;

    const-string v1, "password_reset_requested"

    invoke-static {v0, v1}, Lcom/roblox/client/login/mvp/ActivityLoginMVP;->B1(Lcom/roblox/client/login/mvp/ActivityLoginMVP;Ljava/lang/String;)V

    return-void
.end method
