.class public final Ld5/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld5/j;


# static fields
.field private static final b:Ld5/k;


# instance fields
.field private final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld5/k;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld5/k;-><init>(Ljava/lang/Object;)V

    sput-object v0, Ld5/k;->b:Ld5/k;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld5/k;->a:Ljava/lang/Object;

    return-void
.end method

.method public static b(Ljava/lang/Object;)Ld5/j;
    .locals 2

    new-instance v0, Ld5/k;

    const-string v1, "instance cannot be null"

    invoke-static {p0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-direct {v0, p0}, Ld5/k;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ld5/k;->a:Ljava/lang/Object;

    return-object v0
.end method
