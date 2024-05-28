.class public interface abstract Lqa/t$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqa/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "g"
.end annotation


# static fields
.field public static final a:Lqa/t$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqa/t$g$a;

    invoke-direct {v0}, Lqa/t$g$a;-><init>()V

    sput-object v0, Lqa/t$g;->a:Lqa/t$g;

    return-void
.end method


# virtual methods
.method public abstract a(Lqa/w;)Lqa/w;
.end method
