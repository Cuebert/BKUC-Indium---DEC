.class public final synthetic Lj5/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5/b;


# static fields
.field public static final synthetic a:Lj5/a0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lj5/a0;

    invoke-direct {v0}, Lj5/a0;-><init>()V

    sput-object v0, Lj5/a0;->a:Lj5/a0;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lj5/b0;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
