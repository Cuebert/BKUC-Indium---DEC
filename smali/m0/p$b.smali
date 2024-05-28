.class final enum Lm0/p$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lm0/p$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lm0/p$b;

.field public static final enum o:Lm0/p$b;

.field public static final enum p:Lm0/p$b;

.field public static final enum q:Lm0/p$b;

.field private static final synthetic r:[Lm0/p$b;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lm0/p$b;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lm0/p$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm0/p$b;->n:Lm0/p$b;

    new-instance v1, Lm0/p$b;

    const-string v3, "START"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lm0/p$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lm0/p$b;->o:Lm0/p$b;

    new-instance v3, Lm0/p$b;

    const-string v5, "END"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lm0/p$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lm0/p$b;->p:Lm0/p$b;

    new-instance v5, Lm0/p$b;

    const-string v7, "CENTER"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lm0/p$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lm0/p$b;->q:Lm0/p$b;

    const/4 v7, 0x4

    new-array v7, v7, [Lm0/p$b;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lm0/p$b;->r:[Lm0/p$b;

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

.method public static valueOf(Ljava/lang/String;)Lm0/p$b;
    .locals 1

    const-class v0, Lm0/p$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm0/p$b;

    return-object p0
.end method

.method public static values()[Lm0/p$b;
    .locals 1

    sget-object v0, Lm0/p$b;->r:[Lm0/p$b;

    invoke-virtual {v0}, [Lm0/p$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm0/p$b;

    return-object v0
.end method
