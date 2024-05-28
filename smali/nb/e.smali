.class public final Lnb/e;
.super Lnb/g;
.source "SourceFile"


# static fields
.field public static final a:Lnb/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnb/e;

    invoke-direct {v0}, Lnb/e;-><init>()V

    sput-object v0, Lnb/e;->a:Lnb/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnb/g;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    return-wide v0
.end method
