.class public final enum Lcom/roblox/client/l$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/client/l$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lcom/roblox/client/l$b;

.field public static final enum o:Lcom/roblox/client/l$b;

.field public static final enum p:Lcom/roblox/client/l$b;

.field public static final enum q:Lcom/roblox/client/l$b;

.field private static final synthetic r:[Lcom/roblox/client/l$b;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lcom/roblox/client/l$b;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/l$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/l$b;->n:Lcom/roblox/client/l$b;

    new-instance v1, Lcom/roblox/client/l$b;

    const-string v3, "ARM32"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/roblox/client/l$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/roblox/client/l$b;->o:Lcom/roblox/client/l$b;

    new-instance v3, Lcom/roblox/client/l$b;

    const-string v5, "ARM64"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/roblox/client/l$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/roblox/client/l$b;->p:Lcom/roblox/client/l$b;

    new-instance v5, Lcom/roblox/client/l$b;

    const-string v7, "X86_64"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/roblox/client/l$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/roblox/client/l$b;->q:Lcom/roblox/client/l$b;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/roblox/client/l$b;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 2
    sput-object v7, Lcom/roblox/client/l$b;->r:[Lcom/roblox/client/l$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static b(I)Lcom/roblox/client/l$b;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    .line 1
    sget-object p0, Lcom/roblox/client/l$b;->n:Lcom/roblox/client/l$b;

    return-object p0

    .line 2
    :cond_0
    sget-object p0, Lcom/roblox/client/l$b;->q:Lcom/roblox/client/l$b;

    return-object p0

    .line 3
    :cond_1
    sget-object p0, Lcom/roblox/client/l$b;->p:Lcom/roblox/client/l$b;

    return-object p0

    .line 4
    :cond_2
    sget-object p0, Lcom/roblox/client/l$b;->o:Lcom/roblox/client/l$b;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/client/l$b;
    .locals 1

    const-class v0, Lcom/roblox/client/l$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/client/l$b;

    return-object p0
.end method

.method public static values()[Lcom/roblox/client/l$b;
    .locals 1

    sget-object v0, Lcom/roblox/client/l$b;->r:[Lcom/roblox/client/l$b;

    invoke-virtual {v0}, [Lcom/roblox/client/l$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/client/l$b;

    return-object v0
.end method
