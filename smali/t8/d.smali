.class public abstract Lt8/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:Lx7/e;

.field protected b:Lcom/roblox/client/signup/a$d0;


# direct methods
.method public constructor <init>(Lx7/e;Lcom/roblox/client/signup/a$d0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lt8/d;->a:Lx7/e;

    .line 3
    iput-object p2, p0, Lt8/d;->b:Lcom/roblox/client/signup/a$d0;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/lang/String;)Lh7/j;
.end method

.method public abstract b(ILorg/json/JSONObject;)Ljava/lang/String;
.end method

.method protected c(Ljava/lang/Integer;)V
    .locals 2

    iget-object v0, p0, Lt8/d;->b:Lcom/roblox/client/signup/a$d0;

    sget-object v1, Lcom/roblox/client/signup/a$a0;->p:Lcom/roblox/client/signup/a$a0;

    invoke-interface {v0, v1, p1}, Lcom/roblox/client/signup/a$d0;->b(Lcom/roblox/client/signup/a$a0;Ljava/lang/Integer;)V

    return-void
.end method

.method protected d()V
    .locals 3

    iget-object v0, p0, Lt8/d;->b:Lcom/roblox/client/signup/a$d0;

    sget-object v1, Lcom/roblox/client/signup/a$a0;->o:Lcom/roblox/client/signup/a$a0;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/roblox/client/signup/a$d0;->b(Lcom/roblox/client/signup/a$a0;Ljava/lang/Integer;)V

    return-void
.end method
