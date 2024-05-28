.class public final synthetic Lw/l2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/m2$a;


# static fields
.field public static final synthetic a:Lw/l2;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lw/l2;

    invoke-direct {v0}, Lw/l2;-><init>()V

    sput-object v0, Lw/l2;->a:Lw/l2;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lw/m2$b;)Z
    .locals 0

    invoke-static {p1}, Lw/m2;->b(Lw/m2$b;)Z

    move-result p1

    return p1
.end method
