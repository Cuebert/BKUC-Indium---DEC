.class public final enum Ly1/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ly1/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Ly1/d;

.field public static final enum o:Ly1/d;

.field public static final enum p:Ly1/d;

.field private static final synthetic q:[Ly1/d;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Ly1/d;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ly1/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly1/d;->n:Ly1/d;

    .line 2
    new-instance v1, Ly1/d;

    const-string v3, "VERY_LOW"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ly1/d;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ly1/d;->o:Ly1/d;

    .line 3
    new-instance v3, Ly1/d;

    const-string v5, "HIGHEST"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ly1/d;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ly1/d;->p:Ly1/d;

    const/4 v5, 0x3

    new-array v5, v5, [Ly1/d;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 4
    sput-object v5, Ly1/d;->q:[Ly1/d;

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

.method public static valueOf(Ljava/lang/String;)Ly1/d;
    .locals 1

    const-class v0, Ly1/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly1/d;

    return-object p0
.end method

.method public static values()[Ly1/d;
    .locals 1

    sget-object v0, Ly1/d;->q:[Ly1/d;

    invoke-virtual {v0}, [Ly1/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly1/d;

    return-object v0
.end method
