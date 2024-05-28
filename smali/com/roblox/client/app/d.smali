.class public Lcom/roblox/client/app/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/Boolean;

.field public d:Ljava/lang/Boolean;

.field public e:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/roblox/client/app/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/roblox/client/app/d;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/roblox/client/app/d;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/roblox/client/app/d;->a:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lcom/roblox/client/app/d;->b:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lcom/roblox/client/app/d;->c:Ljava/lang/Boolean;

    .line 9
    iput-object p4, p0, Lcom/roblox/client/app/d;->d:Ljava/lang/Boolean;

    .line 10
    iput-object p5, p0, Lcom/roblox/client/app/d;->e:Ljava/lang/Boolean;

    return-void
.end method
