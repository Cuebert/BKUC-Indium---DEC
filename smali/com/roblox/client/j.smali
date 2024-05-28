.class public final enum Lcom/roblox/client/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/client/j;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum o:Lcom/roblox/client/j;

.field public static final enum p:Lcom/roblox/client/j;

.field public static final enum q:Lcom/roblox/client/j;

.field public static final enum r:Lcom/roblox/client/j;

.field private static final synthetic s:[Lcom/roblox/client/j;


# instance fields
.field private n:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lcom/roblox/client/j;

    const-string v1, "ERROR_APK_FILE_NOT_FOUND"

    const/4 v2, 0x0

    const-string v3, "apk_file_not_found"

    invoke-direct {v0, v1, v2, v3}, Lcom/roblox/client/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/roblox/client/j;->o:Lcom/roblox/client/j;

    .line 2
    new-instance v1, Lcom/roblox/client/j;

    const-string v3, "ERROR_APK_ZIP_FILE_CANT_OPEN"

    const/4 v4, 0x1

    const-string v5, "apk_file_cant_open"

    invoke-direct {v1, v3, v4, v5}, Lcom/roblox/client/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/roblox/client/j;->p:Lcom/roblox/client/j;

    .line 3
    new-instance v3, Lcom/roblox/client/j;

    const-string v5, "ERROR_COPYING_FILE_TO_CACHE"

    const/4 v6, 0x2

    const-string v7, "copying_file_to_cache"

    invoke-direct {v3, v5, v6, v7}, Lcom/roblox/client/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lcom/roblox/client/j;->q:Lcom/roblox/client/j;

    .line 4
    new-instance v5, Lcom/roblox/client/j;

    const-string v7, "ERROR_SO_FILE_MISSING"

    const/4 v8, 0x3

    const-string v9, "so_file_missing"

    invoke-direct {v5, v7, v8, v9}, Lcom/roblox/client/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lcom/roblox/client/j;->r:Lcom/roblox/client/j;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/roblox/client/j;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 5
    sput-object v7, Lcom/roblox/client/j;->s:[Lcom/roblox/client/j;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lcom/roblox/client/j;->n:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/client/j;
    .locals 1

    const-class v0, Lcom/roblox/client/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/client/j;

    return-object p0
.end method

.method public static values()[Lcom/roblox/client/j;
    .locals 1

    sget-object v0, Lcom/roblox/client/j;->s:[Lcom/roblox/client/j;

    invoke-virtual {v0}, [Lcom/roblox/client/j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/client/j;

    return-object v0
.end method
