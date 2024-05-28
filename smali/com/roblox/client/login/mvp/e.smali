.class Lcom/roblox/client/login/mvp/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field c:I

.field d:I


# direct methods
.method constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/roblox/client/login/mvp/e;->a:Ljava/lang/String;

    .line 8
    iput-object v0, p0, Lcom/roblox/client/login/mvp/e;->b:Ljava/lang/String;

    const/16 v0, -0x7da

    .line 9
    iput v0, p0, Lcom/roblox/client/login/mvp/e;->c:I

    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lcom/roblox/client/login/mvp/e;->d:I

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/roblox/client/login/mvp/e;->d:I

    .line 3
    iput-object p1, p0, Lcom/roblox/client/login/mvp/e;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/roblox/client/login/mvp/e;->b:Ljava/lang/String;

    .line 5
    iput p3, p0, Lcom/roblox/client/login/mvp/e;->c:I

    return-void
.end method
