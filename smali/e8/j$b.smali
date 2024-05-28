.class public final enum Le8/j$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le8/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le8/j$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Le8/j$b;

.field public static final enum o:Le8/j$b;

.field public static final enum p:Le8/j$b;

.field public static final enum q:Le8/j$b;

.field public static final enum r:Le8/j$b;

.field private static final synthetic s:[Le8/j$b;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Le8/j$b;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Le8/j$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le8/j$b;->n:Le8/j$b;

    .line 2
    new-instance v1, Le8/j$b;

    const-string v3, "ERROR"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Le8/j$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Le8/j$b;->o:Le8/j$b;

    .line 3
    new-instance v3, Le8/j$b;

    const-string v5, "BOGUS"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Le8/j$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Le8/j$b;->p:Le8/j$b;

    .line 4
    new-instance v5, Le8/j$b;

    const-string v7, "EMPTY_RESPONSE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Le8/j$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Le8/j$b;->q:Le8/j$b;

    .line 5
    new-instance v7, Le8/j$b;

    const-string v9, "UNKNOWN"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Le8/j$b;-><init>(Ljava/lang/String;I)V

    sput-object v7, Le8/j$b;->r:Le8/j$b;

    const/4 v9, 0x5

    new-array v9, v9, [Le8/j$b;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    .line 6
    sput-object v9, Le8/j$b;->s:[Le8/j$b;

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

.method public static valueOf(Ljava/lang/String;)Le8/j$b;
    .locals 1

    const-class v0, Le8/j$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le8/j$b;

    return-object p0
.end method

.method public static values()[Le8/j$b;
    .locals 1

    sget-object v0, Le8/j$b;->s:[Le8/j$b;

    invoke-virtual {v0}, [Le8/j$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le8/j$b;

    return-object v0
.end method
