.class public final synthetic Lw2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/k;


# static fields
.field public static final synthetic a:Lw2/h;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lw2/h;

    invoke-direct {v0}, Lw2/h;-><init>()V

    sput-object v0, Lw2/h;->a:Lw2/h;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lg4/l;
    .locals 0

    check-cast p1, Ljava/util/Map;

    sget p1, Lcom/google/android/gms/common/a;->d:I

    const/4 p1, 0x0

    invoke-static {p1}, Lg4/o;->f(Ljava/lang/Object;)Lg4/l;

    move-result-object p1

    return-object p1
.end method
