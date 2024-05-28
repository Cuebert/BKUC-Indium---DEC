.class public final synthetic Lw/t1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic n:Lw/t1;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lw/t1;

    invoke-direct {v0}, Lw/t1;-><init>()V

    sput-object v0, Lw/t1;->n:Lw/t1;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lw/o0$a;

    check-cast p2, Lw/o0$a;

    invoke-static {p1, p2}, Lw/u1;->H(Lw/o0$a;Lw/o0$a;)I

    move-result p1

    return p1
.end method
