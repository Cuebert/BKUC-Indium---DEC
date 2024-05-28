.class Lcom/roblox/client/game/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/game/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/game/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/client/game/a;


# direct methods
.method private constructor <init>(Lcom/roblox/client/game/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/roblox/client/game/a$e;->a:Lcom/roblox/client/game/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roblox/client/game/a;Lcom/roblox/client/game/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/roblox/client/game/a$e;-><init>(Lcom/roblox/client/game/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/roblox/client/m0;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/a$e;->a:Lcom/roblox/client/game/a;

    return-object v0
.end method
