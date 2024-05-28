.class public final enum Lr7/c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lz7/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lr7/c;",
        ">;",
        "Lz7/h;"
    }
.end annotation


# static fields
.field public static final enum o:Lr7/c;

.field public static final enum p:Lr7/c;

.field public static final enum q:Lr7/c;

.field public static final enum r:Lr7/c;

.field private static final synthetic s:[Lr7/c;


# instance fields
.field private n:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lr7/c;

    const-string v1, "SIGN_UP"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lr7/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lr7/c;->o:Lr7/c;

    .line 2
    new-instance v1, Lr7/c;

    const-string v4, "LOGIN"

    const/4 v5, 0x3

    invoke-direct {v1, v4, v3, v5}, Lr7/c;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lr7/c;->p:Lr7/c;

    .line 3
    new-instance v4, Lr7/c;

    const-string v6, "ABOUT"

    const/4 v7, 0x2

    const/4 v8, 0x5

    invoke-direct {v4, v6, v7, v8}, Lr7/c;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lr7/c;->q:Lr7/c;

    .line 4
    new-instance v6, Lr7/c;

    const-string v8, "SWITCH_TO_LOGIN"

    const/4 v9, 0x6

    invoke-direct {v6, v8, v5, v9}, Lr7/c;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lr7/c;->r:Lr7/c;

    const/4 v8, 0x4

    new-array v8, v8, [Lr7/c;

    aput-object v0, v8, v2

    aput-object v1, v8, v3

    aput-object v4, v8, v7

    aput-object v6, v8, v5

    .line 5
    sput-object v8, Lr7/c;->s:[Lr7/c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lr7/c;->n:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lr7/c;
    .locals 1

    const-class v0, Lr7/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr7/c;

    return-object p0
.end method

.method public static values()[Lr7/c;
    .locals 1

    sget-object v0, Lr7/c;->s:[Lr7/c;

    invoke-virtual {v0}, [Lr7/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr7/c;

    return-object v0
.end method
