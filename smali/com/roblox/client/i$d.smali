.class Lcom/roblox/client/i$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# static fields
.field private static final a:Lcom/roblox/client/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/roblox/client/i;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/roblox/client/i;-><init>(Lcom/roblox/client/i$a;)V

    sput-object v0, Lcom/roblox/client/i$d;->a:Lcom/roblox/client/i;

    return-void
.end method

.method static synthetic a()Lcom/roblox/client/i;
    .locals 1

    sget-object v0, Lcom/roblox/client/i$d;->a:Lcom/roblox/client/i;

    return-object v0
.end method
